package modelo.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.*;
 
/**
 * 
 * @author irakasle
 *	todos los métodos que accedan a la BBDD estarán aqui
 *	en esta clase no tiene que haber ningun Scanner ni System.ou.println
 */
public class AccesoBBDD extends Conector{

	public boolean insertarUsuario(Usuario usuario) {
		String st = "INSERT INTO usuarios (nombre_apellido, dni, codigo) VALUES (?,?,?)";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setString(1, usuario.getNombreApellido());
			pst.setString(2, usuario.getDni());
			pst.setString(3, usuario.getCodigo());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	public Usuario getUsuario(int id) {
		String st = "SELECT * FROM usuarios WHERE id = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			Usuario usuario = new Usuario();
			
			usuario.setIdUsuario(rs.getInt("id"));
			usuario.setNombreApellido(rs.getString("nombre_apellido"));
			usuario.setDni(rs.getString("dni"));
			usuario.setCodigo(rs.getString("codigo"));
			
			return usuario;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean eliminarUsuario(int id) {
		
		String st = "DELETE FROM usuarios WHERE id = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, id);
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean modificarUsuario(Usuario usuario) {
		
		String st = "UPDATE usuarios SET nombre_apellido =?, dni = ?, codigo =? WHERE id=? ";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setString(1, usuario.getDni());
			pst.setString(2, usuario.getNombreApellido());
			pst.setString(3, usuario.getCodigo());
			pst.setInt(4, usuario.getIdUsuario());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public ArrayList<Usuario> getsUsuarios() {
		String st = "SELECT * FROM usuarios";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			ResultSet rs = pst.executeQuery();
			
			ArrayList<Usuario> usuarios = new ArrayList<>();
			
			while(rs.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setIdUsuario(rs.getInt("id"));
				usuario.setNombreApellido(rs.getString("nombre_apellido"));
				usuario.setDni(rs.getString("dni"));
				usuario.setCodigo(rs.getString("codigo"));
				
				usuarios.add(usuario);
			}
			
			return usuarios;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<Inscripcion> getInscripciones(int idActividad) {
		String st = "SELECT * FROM inscripciones WHERE id_actividad = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, idActividad);
			
			ResultSet rs = pst.executeQuery();
			
			ArrayList<Inscripcion> inscripciones = new ArrayList<>();
			
			while(rs.next()) {
				Inscripcion inscripcion = new Inscripcion();
				
				inscripcion.setId(rs.getInt("id"));
				inscripcion.setIdUsuario(rs.getInt("id_usuario"));
				inscripcion.setIdActividad(rs.getInt("id_actividad"));
				
				inscripciones.add(inscripcion);
			}
			
			return inscripciones;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String modificarDiasSemanaActividad(int id, String diasSemana) {
		String st = "UPDATE actividades SET dias_semana = ? WHERE id = ? ";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setString(1, diasSemana);
			pst.setInt(2, id);
			
			pst.executeUpdate();
			return "Actividad modificada";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "ERROR!!!";
	}
	
	public int getIdActividad(String nombre) {
		String st = "SELECT id FROM actividades WHERE nombre = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setString(1, nombre);
			
			ResultSet rs = pst.executeQuery();
			
			rs.next();
			
			return rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}
	
	public int getIdUsuario(String codigo) {
		String st = "SELECT id FROM usuarios WHERE codigo = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setString(1, codigo);
			
			ResultSet rs = pst.executeQuery();
			
			rs.next();
			
			return rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}
	
	public String eliminarInscripcion(int idActividad, int idUsuario) {
		String st = "DELETE FROM inscripciones WHERE id_usuario = ? and id_actividad = ?";
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement(st);
			
			pst.setInt(1, idUsuario);
			pst.setInt(2, idActividad);
			
			pst.execute();
			
			return "Inscripcion borrada";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "ERROR!!!";
	}

}

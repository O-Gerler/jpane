package modelo.bean;


public class Usuario {
	
	private int idUsuario;
	private String nombreApellido;
	private String dni;
	private String codigo;
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "id=" + idUsuario +", nombreApellido=" + nombreApellido + ", dni=" + dni + ", codigo=" + codigo;
	}
	
	
	//atributos relacionados con campos
	
		//atributos relacionados con relaciones
		
		//metodos, getters y setters

}

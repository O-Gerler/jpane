package ejecutables;

import java.util.Scanner;

import modelo.dao.AccesoBBDD;

public class ModificarDiaSemana {

	public static void main(String[] args) {
		//TODO crear aqui la aplicacion pricipal
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el id de una actividad");
		int id = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce los dias que quieres cambiar: ");
		String diasSemana = scan.nextLine();
		
		AccesoBBDD accesoBBDD = new AccesoBBDD();
		
		System.out.println(accesoBBDD.modificarDiasSemanaActividad(id, diasSemana));
		
		scan.close();

	}

}

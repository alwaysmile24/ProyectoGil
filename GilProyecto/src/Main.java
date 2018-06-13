import java.util.*;
import csv.*;

public class Main{
	public static void main(String[] args) {
		static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Scanner lector = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Qué desea hacer?");
			System.out.println("1. Agregar un nuevo cliente");
			System.out.println("2. Consultar un cliente");
			System.out.println("3. Eliminar un cliente");
			System.out.println("4. Salir");
			opcion = lector.nextInt();
			switch(opcion){
				case 1:
				
				case 2:
				
				case 3:
				
				case 4:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Opcion invalida...Elige otra");
					break;
			}
		} while(opcion!=4);
		teclado.close();
					
			

		ClavesEntidades entidades = new ClavesEntidades();
		
	}
}

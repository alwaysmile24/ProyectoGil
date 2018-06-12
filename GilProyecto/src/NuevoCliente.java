/**
 @author Ignacio, Cesar, Vanessa
 @version 2018-2
 */
import java.io.*;
import java.util.Scanner;
	
public class NuevoCliente{
	/**
	Este metodo es el principal, se ingresan los datos para crear un nuevo cliente
	@param args Este parametro es un arreglo de cadenas 
	*/
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.print("Nombre(s): ");
		String nombre=teclado.nextLine();
		System.out.print("Apellido Paterno: ");
		String apellidoPaterno=teclado.nextLine();
		System.out.print("Apellido Materno: ");
		String apellidoMaterno=teclado.nextLine();
		System.out.print("Estado: ");
		String estado=teclado.nextLine();
		System.out.print("Municipio: ");
		String municipio=teclado.nextLine();
		System.out.print("Colonia: ");
		String colonia=teclado.nextLine();
		System.out.print("Calle: ");
		String calle=teclado.nextLine();
		System.out.print("Numero: ");
		int numero=teclado.nextInt();
		System.out.print("Numero de paquete: ");
		int paquete=teclado.nextInt();

		System.out.println(nombre);

		Cliente cliente=new Cliente(nombre,apellidoPaterno, apellidoMaterno,estado,municipio,colonia,calle,numero,paquete);
		
	}
}

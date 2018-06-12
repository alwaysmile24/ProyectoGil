/**
@author 
@version 2018-2
Esta es la clase Criba de Eratostenes 
*/
import java.util.ArrayList;
import java.util.*;


public class Eratostenes {

	/**
	Este es el metodo principal el cual recibe un numero natural y obtendra los numeros
	primos anteriores a este. 
	@param args Este parametro es un arreglo de cadenas
	*/
	public static void main(String[] args) {
		//int n = Integer.parseInt(args[0]);
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numero natural");
		int n = lector.nextInt();
		int tope = (int) Math.floor(Math.sqrt(n)) + 1;
		List<Long> compuestos = new ArrayList<Long>();
		for (int i = 2; i <= tope; i++) {
			if (!compuestos.contains(Long.valueOf(i))) {
				for (int j = i; j <= n / i + 1; j++)
					compuestos.add(Long.valueOf(i * j));
			}
		}
		int cont = 0;
		for (int prim = 2; prim < n; prim++) {
			if (!compuestos.contains(Long.valueOf(prim)))
				System.out.println(++cont + ": " + prim);
		}
		lector.close();
	}
	
}
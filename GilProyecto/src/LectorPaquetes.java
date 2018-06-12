package lectores;

import java.util.*;
import lectores.CSVReader;

public class Paquetes
{
	public static Map<String, ArrayList<String>> llenaDiccionario()
	{
		CSVReader archivoPaquetes= new CSVReader("archivos/paquetes.csv");
		ArrayList<String[]> paquetes = archivoPaquetes.csvtoArray();
		Map<String, ArrayList<String>> diccionarioPaquetes = new TreeMap<String,ArrayList<String>>();
		
		ArrayList<String> info;
		for(String [] paquete: paquetes)
		{
			//info = informacion del paquete de cablevision
			info= new ArrayList<String>();
			info.add(paquete[1]);
			info.add(paquete[2]);
			info.add(paquete[3]);
			diccionarioPaquetes.put(paquete[0],info);

		}
		return diccionarioPaquetes;
	}

	public static void muestraPaquetes()
	{
		Map<String, ArrayList<String>> paquetes = llenaDiccionario();
		List<String> keys = new ArrayList<String>(paquetes.keySet());
		for (String key: keys)
		{
		    System.out.println(key + ": " + paquetes.get(key));	
		}
	}

	public static void main(String[] args) {
		LectorPaquetes.muestraPaquetes();
	}
}
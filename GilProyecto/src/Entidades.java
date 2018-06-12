package csv;

import java.util.*;

public class Entidades
{
	//private ArrayList<String[]> estadosConMunicipios;
	//private Map<String, String> estados = new TreeMap<String,String>();
	//private ArrayList<ArrayList<TreeMap<String,String>>> municipios = new ArrayList<ArrayList<TreeMap<String,String>>>();
	//*******private Map<String,TreeMap<String,String>> municipios = new TreeMap<String,TreeMap<String,String>>();
/*
	public ClavesEntidades()
	{
		super("archivos/entidades.csv");
		this.estadosConMunicipios = new ArrayList<String[]>();

		this.estadosConMunicipios = this.csvtoArray();
		this.llenaEstados();
		this.llenaMuncipios();
	}
*/
	public static Map<String, String> llenaEstados()
	{
		CSVReader archivoEntidades= new CSVReader("archivos/entidades.csv");
		ArrayList<String[]> estadosConMunicipios = archivoEntidades.csvtoArray();
		Map<String, String> diccionarioEntidades = new TreeMap<String,ArrayList<String>>();
		for(String [] estado: estadosConMunicipios)
		{
			String key=estado[0];
			String value=estado[1];
			//dandole el formato que necesitamos a las claves de estado
			key = "0"+key;
			estados.put(key,value);
		}
		return diccionarioEntidades;
	}

	public static void imprimeEstados()
	{
		Map<String, String> estados = llenaEstados();
		List<String> keys = new ArrayList<String>(estados.keySet());
		for (String key: keys)
		{
		    System.out.println(key + ": " + estados.get(key));	
		}
	}
/*
	public void llenaMuncipios()
	{
		String claveEdoActual;
		//TreeMap<String,String> = new TreeMap<String,String>();
		TreeMap<String, String> mapaAuxiliar = new TreeMap<String,String>();
		String [] primero = estadosConMunicipios.get(0);
		claveEdoActual=primero[0];

		for(String [] actual : estadosConMunicipios)
		{
			if(!claveEdoActual.equals(actual[0]))
			{
				TreeMap<String,String> clon = this.cloneMap(mapaAuxiliar);
				municipios.put("0"+claveEdoActual,clon);
				claveEdoActual= actual[0];
				mapaAuxiliar.clear();
				mapaAuxiliar.put(actual[2],actual[3]);
			}
			mapaAuxiliar.put(actual[2],actual[3]);
		}
		TreeMap<String,String> clon = this.cloneMap(mapaAuxiliar);
		municipios.put("0"+claveEdoActual,clon);
	}

	public void imprimeMunicipios()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa la clave del del estado de los minicipios que deseas imprimir:");
			String clave = sc.nextLine();
			imprimeMunicipios(clave);
	}

	public void imprimeMunicipios(String aBuscar)
	{
			TreeMap<String,String> mu = this.getMuncicipios(aBuscar);
			if(mu!=null)
			{
				ArrayList<String> keys = new ArrayList<String>(mu.keySet());
				for (String key: keys) {
		    		System.out.println(key + ": " + mu.get(key));	
				}
			}
			else
			{
				System.out.println("La clave que buscas no existe...");
			}
	}

	public void imprimeTodosMunicipios()
	{
		List<String> keys = new ArrayList<String>(municipios.keySet());
		for (String key: keys)
		{
		    System.out.println(key + ": " + municipios.get(key));
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println();	
		}
	}

	public ArrayList<String[]> getestadosConMuncicipios()
	{
		return estadosConMunicipios;
	}

	public Map<String, String> getEstados()
	{
		return estados;
	}

	public Map<String,TreeMap<String,String>> getMuncicipios()
	{
		return municipios;
	}

	public TreeMap<String,String> getMuncicipios(String claveEstado)
	{
		if(municipios.containsKey(claveEstado))
		{
			return municipios.get(claveEstado);
		}
		else
		{	
			return null;
		}
	}

	public void imprimeListaEstadosconMunicipios()
	{
		for(String [] actual: estadosConMunicipios)
			System.out.println("[ "+actual[0]+","+actual[1]+","+actual[2]+","+actual[3]+" ]");
	}
*/
	public static void main(String[] args) {
		Entidades.imprimeEstados();
	}
}
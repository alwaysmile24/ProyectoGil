/**
 @author Ignacio, Cesar, Vanessa
 @version 2018-2
 
Esta es la clase cliente, la cual contiene los datos de este. 
*/
public class Cliente{
	private String nombre;
	private String apePat;
	private String apeMat;
	private String estadoOrigen;
	private String municipioOrigen;

	/**
	Constructor de la clase Cliente
	@param nombre Es el nombre del cliente
	@param apePat es el apellido paterno 
	@param apeMat es el apellido materno 
	@param estadoOrigen 
	@param municipioOrigen
	*/
	public Cliente(String nombre,String apePat,String apeMat, String estadoOrigen, String municipioOrigen){
		this.nombre=nombre;
		this.apePat=apePat;
		this.apeMat=apeMat;
		this.estadoOrigen=estadoOrigen;
		this.municipioOrigen=municipioOrigen;
	}

	/**
	Este es un metodo consultor, devuelve el nombre del Cliente
	@return una cadena con el nombre 
	*/
	public String getNombre(){
		return this.nombre;
	}

	/**
	Este es un metodo modificador, asigna el nombre del Cliente
	*/
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	/**
	Este es un metodo consultor, devuelve el apellido paterno del Cliente
	@return una cadena con el apellido paterno
	*/
	public String getapePat(){
		return this.apePat;
	}

	/**
	Este es un metodo modificador, asigna el apellido paterno al Cliente
	*/
	public void setapePat(String apePat){
		this.apePat=apePat;
	}

	/**
	Este es un metodo consultor, devuelve el apellido materno del Cliente
	@return una cadena con el apellido materno
	*/
	public String getapeMat(){
		return this.apeMat;
	}

	/**
	Este es un metodo modificador, asigna el apellido materno al Cliente
	*/
	public void setapeMat(String apeMat){
		this.apeMat=apeMat;
	}

	/**
	Este es un metodo consultor, devuelve el estado de origen del Cliente
	@return una cadena con el estado de origen
	*/
	public String getestadoOrigen(){
		return this.estadoOrigen;
	}

	/**
	Este es un metodo modificador, asigna el estado de origen del Cliente
	*/
	public void setestadoOrigen(String estadoOrigen){
		this.estadoOrigen=estadoOrigen;
	}

	/**
	Este es un metodo consultor, devuelve el municipio de origen del Cliente
	@return una cadena con el municipio de origen
	*/
	public String getmunicipioOrigen(){
		return this.municipioOrigen;
	}

	/**
	Este es un metodo modificador, asigna el municipio de origen del Cliente
	*/
	public void setmunicipioOrigen(String municipioOrigen){
		this.municipioOrigen=municipioOrigen;
	}
}


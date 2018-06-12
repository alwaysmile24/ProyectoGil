package cliente;
//pueden agregar comencatios desde github :)

public class Cliente{
	private String nombre;
	private String apePat;
	private String apeMat;
	private String paqueteContratado;
	private Cuenta cuenta;
	private Ubicacion ubicacion;

	public Cliente(String nombre,String apePat,String apeMat,Ubicacion ubicacion,Cuenta cuenta){
		this.nombre=nombre;
		this.apePat=apePat;
		this.apeMat=apeMat;
		this.ubicacion=ubicacion;
		this.cuenta=cuenta;
	}

	public Cliente(String nombre,String apePat,String apeMat){
		this.nombre=nombre;
		this.apePat=apePat;
		this.apeMat=apeMat;
		this.ubicacion=null;
		this.cuenta=null;
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getapePat(){
		return this.apePat;
	}
	public void setapePat(String apePat){
		this.apePat=apePat;
	}

	public String getapeMat(){
		return this.apeMat;
	}
	public void setapeMat(String apeMat){
		this.apeMat=apeMat;
	}

	public Ubicacion getUbicacion()
	{
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion)
	{
		this.ubicacion=ubicacion;
	}

	public void setUbicacion(String estado,String municipio,String localidad, String calle,String numero)
	{
		Ubicacion ub = new Ubicacion(estado,municipio,localidad,calle,numero);
		this.setUbicacion(ub);
	}
}


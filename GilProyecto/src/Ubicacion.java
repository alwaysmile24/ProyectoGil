package cliente;

import java.util.*;

public class Ubicacion
{
	private String estado;
	private String municipio;
	private String localidad;
	private String calle;
	private String numero;

	public Ubicacion(String estado,String municipio,String localidad,String calle, String numero)
	{
		this.estado=estado;
		this.municipio=municipio;
		this.localidad=localidad;
		this.calle=calle;
		this.numero=numero;
	}

	public Ubicacion(String estado,String municipio)
	{
		this.estado=estado;
		this.municipio=municipio;
		this.localidad=null;
		this.calle=null;
		this.numero=null;
	}

	public Ubicacion()
	{
		this.estado=null;
		this.municipio=null;
		this.localidad=null;
		this.calle=null;
		this.numero=null;
	}

	public String getEstado()
	{
		return this.estado;
	}
	public void setEstado(String estado)
	{
		this.estado=estado;
	}

	public String getMunicipio()
	{
		return this.municipio;
	}

	public void setMunicipio(String municipio)
	{
		this.municipio=municipio;
	}
	
	public String getlocalidad(){
		return this.localidad;
	}
	public void setlocalidad(String colonio){
		this.localidad=localidad;
	}

	public String getCalle(){
		return this.calle;
	}
	public void setCalle(String calle){
		this.calle=calle;
	}
	
	public String getNumero(){
		return this.numero;
	}
	public void setNumero(String numero){
		this.numero=numero;
	}

}
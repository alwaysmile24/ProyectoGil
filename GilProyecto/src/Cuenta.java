package cliente;

import java.util.*;

public class Cuenta
{
	private String cuenta;
	private String cuentaEncriptada;


	public Cuenta(String cuenta)
	{
		this.cuenta=cuenta;
	}

	public String getCuentaEncriptada()
	{
		return this.cuenta;
	}

	public void setCuentaEncriptada(String cuenta)
	{
		//hace falta validar que la cuenta sea un Isbn valido
		this.cuenta=cuenta;
	}

	//aún faltan métodos para obtener cuenta encriptada. Una vez que tengamos el RSA será sencillo.
}
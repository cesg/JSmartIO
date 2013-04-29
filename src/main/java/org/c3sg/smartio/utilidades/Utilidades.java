package org.c3sg.smartio.utilidades;

public class Utilidades {

	public static final String SALTO_LINEA = "\n";
	public static final String CADENA_VACIA = "";
	
	public static int stringAInt(final String objetivo, final int defecto){
		
		int resultado = defecto;
		try {
			resultado = Integer.parseInt(objetivo);
		} catch (NumberFormatException e) {
		}
		return resultado;
	}
}


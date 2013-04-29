package org.c3sg.smartio.utilidades;

public class Convertir {

    private static boolean mostrarError;

    /**
     * Convierte una cadena a un número double, utiliza la clase wrap del
     * primitivo <code>double</code>.</br> es necesario verificar que no sea
     * nulo al asignar a un primitivo.
     * 
     * @param x
     *            Cadena a convertir a double.
     * @return Wrapper con el resultado de la conversion.
     * @see java.lang.Double#parseDouble(String)
     */
    public static Double aDouble(final String x) {
	Double valor = null;

	if (x != null) {
	    try {
		valor = Double.parseDouble(x);
	    } catch (NumberFormatException e) {
		if (mostrarError)
		    new JConsola().escribeError(e.getMessage(), true);
	    }
	}
	return valor;
    }

    /**
     * Convierte una cadena a un número float, utiliza la clase wrap del
     * primitivo <code>float</code>.</br> es necesario verificar que no sea nulo
     * al asignar a un primitivo.
     * 
     * @param x
     *            Cadena a convertir a float.
     * @return Wrapper con el resultado de la conversion.
     * @see java.lang.Float#parseFloat(String)
     */
    public static Float aFloat(final String x) {
	Float valor = null;

	if (x != null) {
	    try {
		valor = Float.parseFloat(x);
	    } catch (NumberFormatException e) {
		if (mostrarError)
		    new JConsola().escribeError(e.getMessage(), true);
	    }
	}
	return valor;
    }

    /**
     * Convierte una cadena a un número int, utiliza la clase wrap del primitivo
     * <code>int</code>.</br> es necesario verificar que no sea nulo al asignar
     * a un primitivo.
     * 
     * @param x
     *            Cadena a convertir a int.
     * @return Wrapper con el resultado de la conversion.
     * @see java.lang.Integer#parseInt(String)
     */
    public static Integer aInt(final String x) {
	Integer valor = null;

	if (x != null) {
	    try {
		valor = Integer.parseInt(x);
	    } catch (NumberFormatException e) {
		if (mostrarError)
		    new JConsola().escribeError(e.getMessage(), true);
	    }
	}

	return valor;
    }

    /**
     * Convierte una cadena a un número long, utiliza la clase wrap del
     * primitivo <code>long</code>.</br> es necesario verificar que no sea nulo
     * al asignar a un primitivo.
     * 
     * @param x
     *            Cadena a convertir a long.
     * @return Wrapper con el resultado de la conversion.
     * @see java.lang.Long#parseLong(String)
     */
    public static Long aLong(final String x) {
	Long valor = null;

	if (x != null) {
	    try {
		valor = Long.parseLong(x);
	    } catch (NumberFormatException e) {
		if (mostrarError)
		    new JConsola().escribeError(e.getMessage(), true);
	    }
	}
	return valor;
    }

    public static void setMostrarError(boolean m) {
	mostrarError = m;
    }

}

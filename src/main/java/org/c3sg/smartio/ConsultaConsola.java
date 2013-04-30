package org.c3sg.smartio;

import org.c3sg.smartio.utilidades.Constantes;
import org.c3sg.smartio.utilidades.JConsola;

/**
 * Implementa los metodos para realizar consultas atravez de la </br> consola de
 * java. </br>Implements: {@link org.c3sg.smartio.Consulta}</br>
 * 
 * @author c3sg
 * @version 2013-1
 */
public class ConsultaConsola implements Consulta {

    private JConsola consola = new JConsola();

    public ConsultaConsola() {
    }

    public Double getDouble(boolean validar) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_DOUBLE);
	consola.escribe(strbuilder, true);

	Double valor = null;
	if (validar) {
	    do {
		valor = consola.capturaDouble();
		if (valor == null) {
		    consola.escribeError(Constantes.MSG_ERROR, true);
		}
	    } while (valor == null);
	} else
	    valor = consola.capturaDouble();

	return valor;
    }

    public Double getDouble(double min, double max) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_DOUBLE);
	strbuilder.append(Constantes.MSG_MIN);
	strbuilder.append(min);
	strbuilder.append(Constantes.MSG_MAX);
	strbuilder.append(max);

	consola.escribe(strbuilder, true);
	Double valor = null;

	do {
	    valor = consola.capturaDouble();
	    if (valor != null) {
		if (valor.doubleValue() < min || valor.doubleValue() > max) {
		    consola.escribeError(Constantes.MSG_ERR_MIN_MAX, false);
		    consola.escribeError(Constantes.MSG_ERROR, true);
		    valor = null;
		}
	    } else
		consola.escribeError(Constantes.MSG_ERROR, true);
	} while (valor == null);

	return valor;
    }

    public Float getFloat(boolean validar) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_FLOAT);
	consola.escribe(strbuilder, true);

	Float valor = null;
	if (validar) {
	    do {
		valor = consola.capturaFloat();
		if (valor == null) {
		    consola.escribeError(Constantes.MSG_ERROR, true);
		}
	    } while (valor == null);
	} else
	    valor = consola.capturaFloat();

	return valor;
    }

    public Float getFloat(float min, float max) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_FLOAT);
	strbuilder.append(Constantes.MSG_MIN);
	strbuilder.append(min);
	strbuilder.append(Constantes.MSG_MAX);
	strbuilder.append(max);

	consola.escribe(strbuilder, true);
	Float valor = null;

	do {
	    valor = consola.capturaFloat();
	    if (valor != null) {
		if (valor.floatValue() < min || valor.floatValue() > max) {
		    consola.escribeError(Constantes.MSG_ERR_MIN_MAX, false);
		    consola.escribeError(Constantes.MSG_ERROR, true);
		    valor = null;
		}
	    } else
		consola.escribeError(Constantes.MSG_ERROR, true);
	} while (valor == null);
	return valor;
    }

    public Integer getInt(boolean validar) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_INT);
	consola.escribe(strbuilder, true);

	Integer valor = null;
	if (validar) {
	    do {
		valor = consola.capturaInt();
		if (valor == null) {
		    consola.escribeError(Constantes.MSG_ERROR, true);
		}
	    } while (valor == null);
	} else
	    valor = consola.capturaInt();

	return valor;
    }

    public Integer getInt(int min, int max) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_INT);
	strbuilder.append(Constantes.MSG_MIN);
	strbuilder.append(min);
	strbuilder.append(Constantes.MSG_MAX);
	strbuilder.append(max);

	consola.escribe(strbuilder, true);
	Integer valor = null;

	do {
	    valor = consola.capturaInt();
	    if (valor != null) {
		if (valor.intValue() < min || valor.intValue() > max) {
		    consola.escribeError(Constantes.MSG_ERR_MIN_MAX, false);
		    consola.escribeError(Constantes.MSG_ERROR, true);
		    valor = null;
		}
	    } else
		consola.escribeError(Constantes.MSG_ERROR, true);
	} while (valor == null);

	return valor;
    }

    public Long getLong(boolean validar) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_LONG);
	consola.escribe(strbuilder, true);

	Long valor = null;
	if (validar) {
	    do {
		valor = consola.capturaLong();
		if (valor == null) {
		    consola.escribeError(Constantes.MSG_ERROR, true);
		}
	    } while (valor == null);
	} else
	    valor = consola.capturaLong();

	return valor;
    }

    public Long getLong(double min, double max) {
	StringBuilder strbuilder = new StringBuilder(Constantes.MASK);
	strbuilder.append(Constantes.MSG_INGRESE);
	strbuilder.append(Constantes.TIPO_LONG);
	strbuilder.append(Constantes.MSG_MIN);
	strbuilder.append(min);
	strbuilder.append(Constantes.MSG_MAX);
	strbuilder.append(max);

	consola.escribe(strbuilder, true);
	Long valor = null;

	do {
	    valor = consola.capturaLong();
	    if (valor != null) {
		if (valor.longValue() < min || valor.longValue() > max) {
		    consola.escribeError(Constantes.MSG_ERR_MIN_MAX, false);
		    consola.escribeError(Constantes.MSG_ERROR, true);
		    valor = null;
		}
	    } else
		consola.escribeError(Constantes.MSG_ERROR, true);
	} while (valor == null);

	return valor;
    }
}

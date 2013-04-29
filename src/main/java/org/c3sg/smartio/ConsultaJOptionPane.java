package org.c3sg.smartio;

import java.awt.Component;

import javax.swing.JOptionPane;

import org.c3sg.smartio.utilidades.Constantes;
import org.c3sg.smartio.utilidades.Convertir;

/**
 * @author c3sg
 * @version 2013-1
 * 
 */
public class ConsultaJOptionPane implements Consulta {

    private Component componet;

    public ConsultaJOptionPane(Component componet) {
	this.componet = componet;
    }

    public Double getDouble(boolean validar) {
	StringBuilder strBuilder = new StringBuilder();
	strBuilder.append(Constantes.MSG_INGRESE);
	strBuilder.append(Constantes.TIPO_DOUBLE);
//	String resultStr = JOptionPane.showInputDialog(componet, strBuilder);

	Double valor = null;
	if (validar) {
	    do {
		valor = Convertir.aDouble(JOptionPane.showInputDialog(componet, strBuilder));
	    } while (valor == null);
	} else
	    valor = Convertir.aDouble(JOptionPane.showInputDialog(componet, strBuilder));

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

	Double valor = null;

	do {
	    valor = Convertir.aDouble(JOptionPane.showInputDialog(componet,
		    strbuilder));
	    if (valor != null) {
		if (valor.intValue() < min || valor.intValue() > max) {
		    JOptionPane.showMessageDialog(componet,
			    Constantes.MSG_ERR_MIN_MAX, "[ERROR]",
			    JOptionPane.ERROR_MESSAGE);
		    valor = null;
		}
	    } else
		JOptionPane.showMessageDialog(componet, Constantes.MSG_ERROR,
			"[ERROR]", JOptionPane.ERROR_MESSAGE);
	} while (valor == null);

	return valor;
    }

    public Float getFloat(boolean validar) {
	StringBuilder strBuilder = new StringBuilder();
	strBuilder.append(Constantes.MSG_INGRESE);
	strBuilder.append(Constantes.TIPO_FLOAT);
//	String resultStr = JOptionPane.showInputDialog(componet, strBuilder);

	Float valor = null;
	if (validar) {
	    do {
		valor = Convertir.aFloat(JOptionPane.showInputDialog(componet, strBuilder));
	    } while (valor == null);
	} else
	    valor = Convertir.aFloat(JOptionPane.showInputDialog(componet, strBuilder));

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

	Float valor = null;

	do {
	    valor = Convertir.aFloat(JOptionPane.showInputDialog(componet,
		    strbuilder));
	    if (valor != null) {
		if (valor.intValue() < min || valor.intValue() > max) {
		    JOptionPane.showMessageDialog(componet,
			    Constantes.MSG_ERR_MIN_MAX, "[ERROR]",
			    JOptionPane.ERROR_MESSAGE);
		    valor = null;
		}
	    } else
		JOptionPane.showMessageDialog(componet, Constantes.MSG_ERROR,
			"[ERROR]", JOptionPane.ERROR_MESSAGE);
	} while (valor == null);

	return valor;
    }

    public Integer getInt(boolean validar) {
	StringBuilder strBuilder = new StringBuilder();
	strBuilder.append(Constantes.MSG_INGRESE);
	strBuilder.append(Constantes.TIPO_INT);
//	String resultStr = JOptionPane.showInputDialog(componet, strBuilder);

	Integer valor = null;
	if (validar) {
	    do {
		valor = Convertir.aInt(JOptionPane.showInputDialog(componet, strBuilder));
		if(valor == null) {
		    JOptionPane.showMessageDialog(componet, Constantes.MSG_ERROR,
				"[ERROR]", JOptionPane.ERROR_MESSAGE);
		}
	    } while (valor == null);
	} else
	    valor = Convertir.aInt(JOptionPane.showInputDialog(componet, strBuilder));

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

	Integer valor = null;

	do {
	    valor = Convertir.aInt(JOptionPane.showInputDialog(componet,
		    strbuilder));
	    if (valor != null) {
		if (valor.intValue() < min || valor.intValue() > max) {
		    JOptionPane.showMessageDialog(componet,
			    Constantes.MSG_ERR_MIN_MAX, "[ERROR]",
			    JOptionPane.ERROR_MESSAGE);
		    valor = null;
		}
	    } else
		JOptionPane.showMessageDialog(componet, Constantes.MSG_ERROR,
			"[ERROR]", JOptionPane.ERROR_MESSAGE);
	} while (valor == null);

	return valor;
    }

    public Long getLong(boolean validar) {
	StringBuilder strBuilder = new StringBuilder();
	strBuilder.append(Constantes.MSG_INGRESE);
	strBuilder.append(Constantes.TIPO_LONG);
//	String resultStr = JOptionPane.showInputDialog(componet, strBuilder);

	Long valor = null;
	if (validar) {
	    do {
		valor = Convertir.aLong(JOptionPane.showInputDialog(componet, strBuilder));
	    } while (valor == null);
	} else
	    valor = Convertir.aLong(JOptionPane.showInputDialog(componet, strBuilder));

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

	Long valor = null;

	do {
	    valor = Convertir.aLong(JOptionPane.showInputDialog(componet,
		    strbuilder));
	    if (valor != null) {
		if (valor.intValue() < min || valor.intValue() > max) {
		    JOptionPane.showMessageDialog(componet,
			    Constantes.MSG_ERR_MIN_MAX, "[ERROR]",
			    JOptionPane.ERROR_MESSAGE);
		    valor = null;
		}
	    } else
		JOptionPane.showMessageDialog(componet, Constantes.MSG_ERROR,
			"[ERROR]", JOptionPane.ERROR_MESSAGE);
	} while (valor == null);

	return valor;
    }
}

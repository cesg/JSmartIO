package org.c3sg.smartio.utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Encapsula una serie de operaciones comunmente utilizada en la consola </br>
 * de java.
 * @author c3sg
 * @version 2013-1
 */
public class JConsola {

    /**
     * Captura un valor int ingresado en la consola.</br> utiliza el wrap de el
     * primitivo de <code>int</code>
     * 
     * @return int ingresado.
     * @see java.lang.Integer
     * @see java.util.Scanner#nextInt()
     */
    public Integer capturaInt() {
	Integer input = null;
	try {
	    input = getConsole().nextInt();
	} catch (InputMismatchException e) {
	    this.escribeError(e.getMessage(), true);
	}
	return input;
    }

    /**
     * Captura un valor float ingresado en la consola.</br> utiliza el wrap de
     * el primitivo de <code>float</code>
     * 
     * @return float ingresado.
     * @see java.lang.Float
     * @see java.util.Scanner#nextFloat()
     */
    public Float capturaFloat() {
	Float input = null;
	try {
	    input = getConsole().nextFloat();
	} catch (InputMismatchException e) {
	    this.escribeError(e.getMessage(), true);
	}
	return input;
    }

    /**
     * Captura un valor double ingresado en la consola.</br> utiliza el wrap de
     * el primitivo de <code>double</code>
     * 
     * @return double ingresado.
     * @see java.lang.Double
     * @see java.util.Scanner#nextDouble()
     */
    public Double capturaDouble() {
	Double input = null;
	try {
	    input = getConsole().nextDouble();
	} catch (InputMismatchException e) {
	    this.escribeError(e.getMessage(), true);
	}
	return input;
    }

    /**
     * Captura un valor long ingresado en la consola.</br> utiliza el wrap de el
     * primitivo de <code>long</code>
     * 
     * @return long ingresado.
     * @see java.lang.Long
     * @see java.util.Scanner#nextLong()
     */
    public Long capturaLong() {
	Long input = null;
	try {
	    input = getConsole().nextLong();
	} catch (InputMismatchException e) {
	    this.escribeError(e.getMessage(), true);
	}
	return input;
    }

    /**
     * Escribe un objeto en la consola, si se desea saltar una linea establecer
     * <code>salto</code> a </br> verdadero.
     * 
     * @param x
     *            Objecto a escribir en la consola.
     * @param salto
     *            Si se desea saltar una linea.
     */
    public void escribe(final Object x, boolean salto) {
	if (salto)
	    System.out.println(x);
	else
	    System.out.print(x);
    }

    /**
     * Escribe un objeto en la consola, si se desea saltar una linea establecer
     * <code>salto</code> a </br> verdadero.
     * 
     * @param x
     *            Objecto a escribir en la consola.
     * @param salto
     *            Si se desea saltar una linea.
     */
    public void escribeError(final Object x, boolean salto) {
	if (salto)
	    System.err.println(x);
	else
	    System.err.print(x);
    }

    /**
     * @param format
     * @param args
     */
    public void escribeFormato(final String format, Object... args) {
	System.out.printf(format, args);
    }

    private Scanner getConsole() {
	return new Scanner(System.in);
    }
}

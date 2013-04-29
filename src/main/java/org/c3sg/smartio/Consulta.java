package org.c3sg.smartio;

/**
 * Contiene los metodos más comunes para pedir datos al usuario.
 * 
 * @author c3sg
 * @version 2013-1
 */
public interface Consulta {

    /**
     * Pide al usuario que ingrese un número typo <code>double</code>. Utiliza
     * el</br> el wrapper de el primitivo, por lo que este es <code>null</code>
     * si ingresa</br> un valor erroneo.
     * 
     * @return Double obtenido de la consulta.
     */
    Double getDouble(boolean validar);

    /**
     * Pide al usuario que ingrese un número typo <code>double</code> entre un
     * valor</br> minimo y maximo. Utiliza el wrapper del primitivo, por lo que
     * este</br> es <code>null</code> si ingresa un valor erroneo.
     * 
     * @return Double obtenido de la consulta.
     * @param min
     *            valor minimo.
     * @param max
     *            valor maximo.
     */
    Double getDouble(double min, double max);

    /**
     * Pide al usuario que ingrese un número typo <code>float</code>. Utiliza
     * el</br> el wrapper de el primitivo, por lo que este es <code>null</code>
     * si ingresa</br> un valor erroneo.
     * 
     * @return Float obtenido de la consulta.
     */
    Float getFloat(boolean validar);

    /**
     * Pide al usuario que ingrese un número typo <code>float</code> entre un
     * valor</br> minimo y maximo. Utiliza el wrapper del primitivo, por lo que
     * este</br> es <code>null</code> si ingresa un valor erroneo.
     * 
     * @return Float obtenido de la consulta.
     * @param min
     *            valor minimo.
     * @param max
     *            valor maximo.
     */
    Float getFloat(float min, float max);

    /**
     * Pide al usuario que ingrese un número typo <code>int</code>. Utiliza
     * el</br> el wrapper de el primitivo, por lo que este es <code>null</code>
     * si ingresa</br> un valor erroneo.
     * 
     * @return Integer obtenido de la consulta.
     */
    Integer getInt(boolean validar);

    /**
     * Pide al usuario que ingrese un número typo <code>int</code> entre un
     * valor</br> minimo y maximo. Utiliza el wrapper del primitivo, por lo que
     * este</br> es <code>null</code> si ingresa un valor erroneo.
     * 
     * @return Integer obtenido de la consulta.
     * @param min
     *            valor minimo.
     * @param max
     *            valor maximo.
     */
    Integer getInt(int min, int max);

    /**
     * Pide al usuario que ingrese un número typo <code>long</code>. Utiliza
     * el</br> el wrapper de el primitivo, por lo que este es <code>null</code>
     * si ingresa</br> un valor erroneo.
     * 
     * @return Long obtenido de la consulta.
     */
    Long getLong(boolean validar);

    /**
     * Pide al usuario que ingrese un número typo <code>long</code> entre un
     * valor</br> minimo y maximo. Utiliza el wrapper del primitivo, por lo que
     * este</br> es <code>null</code> si ingresa un valor erroneo.
     * 
     * @return Long obtenido de la consulta.
     * @param min
     *            valor minimo.
     * @param max
     *            valor maximo.
     */
    Long getLong(double min, double max);
}

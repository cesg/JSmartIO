package org.c3sg.smartio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConsultaJOptionPane {

    private Consulta consulta = new ConsultaJOptionPane(null);

    @Test
    public void testGetDoubleMinMax() {
	assertNotNull(consulta.getDouble(0, 10));
    }

    @Test
    public void testGetDoubleTrue() {
	assertNotNull(consulta.getDouble(true));
    }

    @Test
    public void testGetFloatMinMax() {
	assertNotNull(consulta.getFloat(0, 10));
    }

    @Test
    public void testGetFloatTrue() {
	assertNotNull(consulta.getFloat(true));
    }

    @Test
    public void testGetIntMinMax() {
	assertNotNull(consulta.getInt(0, 10));
    }

    @Test
    public void testGetIntTrue() {
	assertNotNull(consulta.getInt(true));
    }

    @Test
    public void testGetLongMinMax() {
	assertNotNull(consulta.getLong(0, 10));
    }

    @Test
    public void testGetLongTrue() {
	assertNotNull(consulta.getLong(true));
    }

}

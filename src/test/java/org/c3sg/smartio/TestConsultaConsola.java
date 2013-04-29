package org.c3sg.smartio;

import static org.junit.Assert.*;

import org.c3sg.smartio.utilidades.Convertir;
import org.junit.Before;
import org.junit.Test;

public class TestConsultaConsola {

    private Consulta consulta = new ConsultaConsola();

    @Before
    public void init() {
	Convertir.setMostrarError(true);
    }

    @Test
    public void testGetDoubleMinMax() {
	assertNotNull(consulta.getLong(0, 10));
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
	assertNotNull(consulta.getDouble(0, 10));
    }

    @Test
    public void testGetLongTrue() {
	assertNotNull(consulta.getLong(true));
    }
}

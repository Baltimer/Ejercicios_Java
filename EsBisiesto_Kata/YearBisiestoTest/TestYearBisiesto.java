package org.foobarspam.YearBisiestoTest;

import static org.junit.Assert.*;

import org.foobarspam.YearBisiesto.*;
import org.junit.Test;
public class TestYearBisiesto {

	@Test
	public void test_esBisiesto_uno() {
		assertEquals("Numero acabado en 1",false, YearBisiesto.esBisiesto(651));
	}
	@Test
	public void test_esBisiesto_dos() {
		assertEquals("Numero acabado en 2",false, YearBisiesto.esBisiesto(9542));
	}
	@Test
	public void test_esBisiesto_tres() {
		assertEquals("Numero acabado en 3",false, YearBisiesto.esBisiesto(4253));
	}
	@Test
	public void test_esBisiesto_cuatro() {
		assertEquals("Numero acabado en 4",true, YearBisiesto.esBisiesto(1984));;
	}
	@Test
	public void test_esBisiesto_cinco() {
		assertEquals("Numero acabado en 5",false, YearBisiesto.esBisiesto(1995));
	}
	@Test
	public void test_esBisiesto_seis() {
		assertEquals("Numero acabado en 6",false, YearBisiesto.esBisiesto(9766));
	}
	@Test
	public void test_esBisiesto_siete() {
		assertEquals("Numero acabado en 7",false, YearBisiesto.esBisiesto(5737));
	}
	@Test
	public void test_esBisiesto_ocho() {
		assertEquals("Numero acabado en 8",true, YearBisiesto.esBisiesto(3548));
	}
	@Test
	public void test_esBisiesto_nueve() {
		assertEquals("Numero acabado en 9",false, YearBisiesto.esBisiesto(1999));
	}
}

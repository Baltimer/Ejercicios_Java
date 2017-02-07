package BiciPalmaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;
import estacion.Estacion;

public class appalmaTest {

	Estacion estacion = new Estacion();
	Bicicleta bicicleta = new Bicicleta();
	Bicicleta bicicleta1 = new Bicicleta();
	Bicicleta bicicleta2 = new Bicicleta();
	TarjetaUsuario tarjeta = new TarjetaUsuario();
	TarjetaUsuario tarjeta2 = new TarjetaUsuario();
	
	@Before
	public void setUp(){
		estacion = new Estacion();
		bicicleta = new Bicicleta();
		bicicleta1 = new Bicicleta();
		bicicleta2 = new Bicicleta();
		tarjeta = new TarjetaUsuario();
		tarjeta2 = new TarjetaUsuario();
	}
	@Test
	public void consultarEstacionTest(){
		estacion = new Estacion(5, "casa", 3);
		estacion.consultarEstacion();
	}
	
	@Test
	public void anclajesLibresTest(){
		estacion = new Estacion(5, "casa", 3);
		bicicleta = new Bicicleta(28);
		assertEquals(3, estacion.anclajesLibres());
		estacion.anclarBicicleta(bicicleta);
		assertEquals(2, estacion.anclajesLibres());
	}
	
	@Test
	public void consultarAnclajesTest(){
		estacion = new Estacion(5, "casa", 3);
		estacion.consultarAnclajes();
	}
	
	@Test
	public void anclarBicicletaTestYMostrarAnclajeTest(){
		estacion = new Estacion(5, "casa", 3);
		bicicleta = new Bicicleta(27);
		bicicleta1 = new Bicicleta(20);
		bicicleta2 = new Bicicleta(10);
		estacion.anclarBicicleta(bicicleta);
		estacion.anclarBicicleta(bicicleta1);
		estacion.anclarBicicleta(bicicleta2);
	}
	
	@Test
	public void leerTarjetaUsuarioTest(){
		estacion = new Estacion(5, "casa", 3);
		tarjeta = new TarjetaUsuario("1", true);
		tarjeta2 = new TarjetaUsuario("2", false);
		assertEquals(true, estacion.leerTarjetaUsuario(tarjeta));
		assertEquals(false, estacion.leerTarjetaUsuario(tarjeta2));
	}
	
	@Test
	public void retirarBicicletaTest(){
		estacion = new Estacion(5, "casa", 3);
		bicicleta = new Bicicleta(27);
		bicicleta1 = new Bicicleta(20);
		bicicleta2 = new Bicicleta(10);
		tarjeta = new TarjetaUsuario("1", true);
		
		estacion.anclarBicicleta(bicicleta);
		estacion.anclarBicicleta(bicicleta1);
		estacion.anclarBicicleta(bicicleta2);
		estacion.retirarBicicleta(tarjeta);
	}
}

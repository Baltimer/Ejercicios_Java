package estacion;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
	// -------------------- Propiedades --------------------	
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = new Bicicleta[numeroAnclajes];

	// -------------------- Constructores --------------------
	public Estacion() {

	}

	public Estacion(int id, String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}

	// -------------------- Getters y Setters --------------------
	public int getId() {
		return this.id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}

	public void setAnclajes(int posicion, Bicicleta bicicleta){
		this.anclajes[posicion] = bicicleta;
	}
	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}

	// -------------------- METODOS --------------------
	public void consultarEstacion() {
		System.out.println("Id: " + getId());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Numero anclajes: " + getNumeroAnclajes());
	}

	public int anclajesLibres() {
		int libres = 0;
		for (Bicicleta bicicleta : getAnclajes()) {
			if (bicicleta == null) {
				libres++;
			}
		}
		return libres;
	}

	public void consultarAnclajes() {
		for (int i = 0; i < anclajes.length; i++) {
			if (anclajes[i] != null) {
				System.out.println("En el anclaje " + i + " se encuentra la bicicleta: " + anclajes[i].getId());
			} else {
				System.out.println("En el anclaje " + i + " no hay ninguna bicicleta.");
			}
		}
	}

	public void anclarBicicleta(Bicicleta bicicleta) {
		int numeroAnclaje = -1;
		for (int i = 0; i < getAnclajes().length; i++) {
			if (getAnclajes()[i] == null) {
				setAnclajes(i, bicicleta);
				numeroAnclaje = i;
				break;
			}
		}
		if (numeroAnclaje != -1) {
			mostrarAnclaje(bicicleta, numeroAnclaje);
		} else {
			System.out.println("No se ha podido anclar, no hay espacio");
		}
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		if (numeroAnclaje != -1) {
			System.out.println("La bicicleta " + bicicleta.getId() + " está en el Anclaje numero: " + numeroAnclaje);
		} else {
			System.out.println("No se ha podido anclar, no hay espacio");
		}
	}

	public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.getActivada();
	}

	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		if (!tarjetaUsuario.getActivada()) {
			System.out.println("Lo sentimos, la tarjeta no está activada.");
		} else {
			int numeroAnclaje = generarAnclaje();
			mostrarBicicleta(getAnclajes()[numeroAnclaje], numeroAnclaje);
			getAnclajes()[numeroAnclaje] = null;
		}
	}

	public void mostrarBicicleta(Bicicleta bicicleta, int posicion) {
		System.out.println("Se ha retirado la " + bicicleta.getId() + " del anclaje numero " + posicion);
	}

	public int generarAnclaje() {
		int numeroAnclaje = ThreadLocalRandom.current().nextInt(0, getAnclajes().length - 1);
		while (getAnclajes()[numeroAnclaje] == null) {
			numeroAnclaje = ThreadLocalRandom.current().nextInt(0, getAnclajes().length - 1);
		}
		return numeroAnclaje;
	}
}
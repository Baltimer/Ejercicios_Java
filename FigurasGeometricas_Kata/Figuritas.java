package org.foobarspam.FigurasGeometricas.figura;

import java.util.ArrayList;

public class Figuritas {
	
	
	public static void main (String[] args){
		// Main del programa
		
		//Utilizamos una colecci�n de ArrayList para guardar las figuras
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		
		//Declaramos las figuras
		Rectangulo rectangulo1 = new Rectangulo(3, 4);
		Rectangulo rectangulo2 = new Rectangulo("Rectangulo", 3, 4);
		//Circulo circulo1 = new Circulo(5);
		Cuadrado cuadrado1 = new Cuadrado(4);
		Cuadrado cuadrado2 = new Cuadrado("Cuadrado", 6);
		//Elipse elipse1 = new Elipse(3, 5);
		
		//A�adimos las figuras en el ArrayList
		figuras.add(rectangulo1);
		figuras.add(rectangulo2);
		figuras.add(cuadrado1);
		figuras.add(cuadrado2);
		
		//Recorremos el ArrayList para imprimir el contenido
		for(FiguraGeometrica figura : figuras){
			System.out.println("La figura " + figura.getNombre() +
					" tiene un �rea de: " + figura.area());
		}
		
		if(rectangulo1.area() == 12) {
			System.out.println("rectangulo1: OK");
		} else {
			System.out.println("rectangulo1: NO OK");
		}
		
		if(cuadrado1.area() == 16) {
			System.out.println("cuadrado1: OK");
		} else {
			System.out.println("cuadrado1: NO OK");
		}
		
		assert(13 == rectangulo2.area());
	}
}

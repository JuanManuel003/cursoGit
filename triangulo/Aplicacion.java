package co.uniquindio.primerPrograma.triangulo;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String args[]) {
		double base;
		double altura;
		double area = 0;
		base = leerDoubleConsola("Ingrese la base: ");
		altura = leerDoubleConsola("Ingrese la altura: ");
		Triangulo miTriangulo; 
		miTriangulo = new Triangulo();
		miTriangulo.setBase(base); 
		miTriangulo.setAltura(altura); 
		area = miTriangulo.calcularArea(); 
		System.out.println("El area es " + area);
	}

	//sirve para que el usuario ingrese los valores
	public static double leerDoubleConsola(String mensaje) {
		double dato = 0;
		String captura = "";
		System.out.println(mensaje);
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		dato = Double.parseDouble(captura);
		return dato;
	}

}

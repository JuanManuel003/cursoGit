package co.uniquindio.primerPrograma.triangulo;

public class Aplicacion 
{
	public static void main(String[]args)
	{
		double base=5;
		double altura=4;
		double area=0;
		double volumen=0;
		
		Triangulo miTriangulo;// declaracion de un objeto
		miTriangulo=new Triangulo();// inicializacion del objeto 
		miTriangulo.setBase(base);// aca fijamos el valor de "base"
		miTriangulo.setAltura(altura);//aca fijamos el valor de "altura"
		area=miTriangulo.calcularArea();// aca le damos valor a la variable base segun lo que esta en la clase triangulo
		volumen=miTriangulo.calcularVolumen();
		
		System.out.print("el area es: " + area +
				"\nel volumen es: "+ volumen+"\n\ndone by juan.");
		
		
	}
}

package co.uniquindio.primerPrograma.triangulo;

public class Triangulo 
{
	private double base;
	private double altura;
	
	public void setBase(double base) 
	{
		this.base=base;
	}
	
	public void setAltura(double altura)
	{
		this.altura=altura;
	}
	
	public double calcularArea()
	{
		double area=(base*altura)/2.0;
		return area;
	}
	
	public double calcularVolumen()
	{
		double vol=Math.pow(altura, 3);
		return vol;
	}
}

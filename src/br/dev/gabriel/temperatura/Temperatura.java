package br.dev.gabriel.temperatura;

public class Temperatura {
	
	private static final double Temperatura = 0;
	private double celsius;
	private double fahreinheit;
	private double kelvin;
	
	public void setCelsius(double celsius ) {
		this.celsius = celsius;
	}
	public double getCelsius() {
		return celsius;
	}
	
	public void setFahreinheit(double fahreinheit) {
		this.fahreinheit = fahreinheit;
	}
	public double getFahreinheit() {
		return fahreinheit;
	}
	
	public void setKelvin(double Kelvin) {
		this.kelvin = kelvin;
	}
	public double getKelvin() {
		return kelvin;
	}
	
	public double mostrarTemperatura() {
		
		double celsius = fahreinheit = kelvin;
		return Temperatura;
		
		
		
	}
	

}

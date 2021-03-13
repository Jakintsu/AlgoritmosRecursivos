package com.recursividad;

public class PotenciasRecursivo {

	static boolean esPar(int n) {
		return n % 2 == 0;
	}
	
	static boolean esImpar(int n) {
		return !esPar(n);
	}
	
	static double potenciaRecursivo(int base, int exponente) {
		System.out.println("Vamos a calcular: " + base + 
				" elevado a "+exponente);
		//Caso base
		if(exponente == 0) {
			return 1;
		}
		if(exponente < 0) {
			double resultado = potenciaRecursivo(base, -exponente);
			return 1/resultado;
		}
		if(esImpar(exponente)) {
			return base*potenciaRecursivo(base, exponente - 1);
		}
		if(exponente % 2 == 0 && exponente > 0) {
			double resultado = potenciaRecursivo(base, exponente/2);
			return resultado*resultado;
		}
		
		return 0;
	}
	public static void main(String[] args) {

		System.out.println(potenciaRecursivo(2, -5));
	}

}

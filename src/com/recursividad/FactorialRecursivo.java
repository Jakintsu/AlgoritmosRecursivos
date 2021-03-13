package com.recursividad;

public class FactorialRecursivo {

	static long factorialRecursivo(long n) {
		//Caso base
		if(n==0) {
			return 1;
		}
		//Caso recursivo
		return n*factorialRecursivo(n - 1);
	}
	public static void main(String[] args) {
		
		long factorial = factorialRecursivo(10);
		System.out.println(factorial);

	}

}

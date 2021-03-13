package com.recursividad;

public class PalindromoRecursivo {

	static String primerCaracter(String palabra) {
		String result = "";

		if (palabra.length() >= 1) {
			result = palabra.substring(0, 1);
		} else {
			result = palabra;
		}

		return result;

	}

	static String ultimoCaracter(String palabra) {
		return palabra.substring(palabra.length() - 1);
	}

	static String caracteresIntermedios(String palabra) {
		if (palabra.length() > 1) {
			return palabra.substring(1, palabra.length() - 1);
		} else
			return palabra;
	}

	static boolean esPalindromo(String palabra) {

		if (palabra.length() == 0) {
			return true;
		}
		if (palabra.length() == 1) {
			return true;
		}

		if (!primerCaracter(palabra).equals(ultimoCaracter(palabra))) {
			return false;
		}

		return esPalindromo(caracteresIntermedios(palabra));

	}

	public static void main(String[] args) {

		String palabra = "amama";
		System.out.println(esPalindromo(palabra));

	}

}

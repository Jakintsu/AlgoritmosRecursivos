package com.recursividad;

public class OrdenamientoRapido {
	
	static void intercambio(int[] array, int primerIndice, 
			int segundoIndice) {
		int temporal = array[primerIndice];
		array[primerIndice] = array[segundoIndice];
		array[segundoIndice] = temporal;
	}
	
	static int particion(int[] arreglo, int inicio, int fin) {
		int comienzo = inicio;
		
		for(int j = comienzo; j < fin; j++) {
			if(arreglo[j] <= arreglo[fin]) {
				intercambio(arreglo, j, comienzo);
				comienzo++;
			}
		}
		intercambio(arreglo, fin, comienzo);
		return comienzo;
	}

	static void ordenamientoRapido(int[] array, int inicio, int fin) {
		if(inicio < fin) {
			int pivote = particion(array, inicio, fin);
			ordenamientoRapido(array, inicio, pivote - 1);
			ordenamientoRapido(array, pivote + 1, fin);
		}
	}
	public static void main(String[] args) {
		
		int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6};
		ordenamientoRapido(array, 0, array.length-1);

		System.out.println("Tras el ordenamiento: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int[] arreglo3 = {9,7,-5, 0, 8};
		int pivote = particion(arreglo3, 0, arreglo3.length - 1);
		System.out.println(pivote);
		
		int[] arreglo2 = {9,7,5, 0, 8};
		int pivote2 = particion(arreglo2, 0, arreglo2.length - 1);
		System.out.println(pivote2);
		
	}

}

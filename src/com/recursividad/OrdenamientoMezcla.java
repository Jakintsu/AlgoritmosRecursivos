package com.recursividad;

public class OrdenamientoMezcla {

	static void mezclar(int[] arreglo, int p, int m, int r) {
		int[] mitadInferior = new int [(int) Math.floor((m-p))+1];
		int[] mitadSuperior = new int [(int) Math.floor((r-m))];
		
		int k = p;
		int indiceIzquierda;
		int indiceDerecha;
		
		for (indiceIzquierda = 0; k <= m; indiceIzquierda++, k++) {
			mitadInferior[indiceIzquierda] = arreglo[k];
		}
		for (indiceDerecha = 0; k <= r; indiceDerecha++, k++) {
			mitadSuperior[indiceDerecha] = arreglo[k];
		}

		k = p;
		indiceIzquierda = 0;
		indiceDerecha = 0;

		while (indiceIzquierda < mitadInferior.length && 
				indiceDerecha < mitadSuperior.length) {
			if (mitadInferior[indiceIzquierda] <= mitadSuperior[indiceDerecha]) {

				arreglo[k] = mitadInferior[indiceIzquierda];

				indiceIzquierda++;

			} else {

				arreglo[k] = mitadSuperior[indiceDerecha];

				indiceDerecha++;

			}

			k++;
		}
		
		while (indiceIzquierda < mitadInferior.length) {
			arreglo[k] = mitadInferior[indiceIzquierda];
			indiceIzquierda++;
			k++;
		}

		while (indiceDerecha < mitadSuperior.length) {
			arreglo[k] = mitadSuperior[indiceDerecha];
			indiceDerecha++;
			k++;
		}

	}

	static void ordenamientoMezcla(int[] arreglo, int p, int r) {
		if (p != r) {
			int m = (int) Math.floor((p + r) / 2);
			ordenamientoMezcla(arreglo, p, m);
			ordenamientoMezcla(arreglo, m + 1, r);
			mezclar(arreglo, p, m, r);
		}
		;

	}

	public static void main(String[] args) {
		int[] array = {3, 7, 12, 14, 2, 6, 9, 11};
		int[] arreglo2 = {0, 9, -2, 8};

		mezclar(arreglo2, 0,
		    (int)Math.floor((0 + arreglo2.length-1) / 2),
		    arreglo2.length-1);
		System.out.println("Array tras la mezcla: " );
		for(int i = 0; i < arreglo2.length; i++) {
			System.out.print(arreglo2[i]+" ");
		}
	}

}

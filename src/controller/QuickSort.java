package controller;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public QuickSort() {
		
		super();
		
/*	private static int[] gerar(int n) {
		int[]v = new int[n];
		Random gerador = new Random();
		for (int i = 0; i < n; i++)
			v[i] = gerador.nextInt(n);
		return v;
			
		}*/
		
			
	}
		
	public static void quicksort(int[] v, int esq, int dir){
		
		if (esq < dir) {
			int j = separar (v, esq, dir);
			quicksort(v, esq, j -1);
			quicksort(v, j +1, dir);
			
		}
	}
	
	

	private static int separar(int[] v, int esq, int dir) {
		int i = esq + 1;
		int j = dir;
		int pivo = v[esq];
		
		while (i <= j) {
			if (v[i] <= pivo)i++;
			else if (v[j] > pivo) j--;
			else if (i <= j) {
				trocar(v, i, j);
				i++;
				j--;
			}
			
		}
		trocar(v, esq, j);
		return j;
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	
	}

}

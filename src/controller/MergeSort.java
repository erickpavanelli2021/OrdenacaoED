package controller;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int[] mergeSort(int[] v, int[] w, int ini, int fim) {
	    if (ini < fim) {
	    	int meio = (ini + fim) /2;
	    	mergeSort (v, w, ini, meio);
	    	mergeSort (v, w, meio +1, fim);
	    	intercalar (v, w, ini, meio, fim);
	    }
	    return v;
	}

	private void intercalar(int[] v, int[] w, int ini, int meio, int fim) {
		for (int g = ini; g <= fim; g++)
			w[g] = v[g];
		int i = ini;
		int j = meio +1;
		
		for (int g = ini; g <=fim; g++) {
			if (i > meio) v[g] = w[j++];
			else if (j > fim) v[g] = w[i++];
			else v[g] = w[j++];
		}
		
	}
}
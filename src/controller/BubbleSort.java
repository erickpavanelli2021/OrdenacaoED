package controller;

public class BubbleSort {

	public BubbleSort() {
		super();
	}
	
	public void bolha (int[] v) {
		for (int last = v.length-1; last >0; last --);
		    int last = 0;
			for (int i = 0; i <last; i++)
		    	if (v[i] > v[i+1])
		    		trocar (v, i, i+1);
		    	
//		return 0;
		
	}

	private void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;		
	}

}
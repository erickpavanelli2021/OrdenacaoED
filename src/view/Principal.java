package view;
//agora foi
import java.util.Arrays;

import controller.BubbleSort;
import controller.MergeSort;
import controller.QuickSort; 


public class Principal {

	

	public static void main(String[] args) {
		
		BubbleSort bSort = new BubbleSort();
		MergeSort Msort = new MergeSort();
		QuickSort qSort = new QuickSort();
		
		
		
		int[]v = {15,18,29,1,0,4,13,18,25,15,43,0};
		int[]w = new int[v.length];
		
		v = qSort.quicksort (v, 0, v.length -1);
		w = Msort.mergeSort(v, w, v.length-1, 0);
		bSort.bolha(v);
		
		System.out.println("====================Ordenação em BubbleSort:========================");
		System.out.println("            "+Arrays.toString( v ));
		//System.out.println("");
		System.out.println("====================================================================");
		System.out.println("====================Ordenação em MergeSort: ========================");
		System.out.println("            "+Arrays.toString( w ));
		//System.out.println("");
		System.out.println("====================================================================");
		System.out.println("====================Ordenação em QuickSort:=========================");
		System.out.println("            "+Arrays.toString( v ));
		//System.out.println("");
		System.out.println("====================================================================");
		
		
	}
	

}
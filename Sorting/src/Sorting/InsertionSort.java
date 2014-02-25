package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		
		for(int i=1; i<unsortdArray.length; i++) {
			for(int j=i; j>0; j--) {
				if(unsortedArray[j] < unsortedArray[j-1]) {
					int tmp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j-1];
					unsortedArray[j-1] = tmp;
				}
				else {
					break;
				}
			}
		}
		
		return null;
	}
}

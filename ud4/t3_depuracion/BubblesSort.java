package com.example.project;

//Java program for implementation 
//of Bubble Sort 

public class BubbleSort {
	int arr[];
	public int[] getArr() {
		return arr;
	}



	public void setArr(int[] arr) {
		this.arr = arr;
	}



	void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	
	
	public boolean comparar() {
		boolean c = false;
		for(int b=0;b!=arr.length-1;b++) {
			if(arr[b]>arr[b+1]) {
				c=false;
				break;
			}else {
				c=true;
				
			}
			
		}
		
		return c;

	}






	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");

		for (int a = 0; a < arr.length; a++) {
			System.out.println("Posición:" + a + " " + arr[a]);
		}

	}
}

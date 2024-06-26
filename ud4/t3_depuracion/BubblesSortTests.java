package com.example.project;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
	
	public class BubbleSortTests{
		
		private BubbleSort bubblecorrecto1 = new BubbleSort ();
		
		private BubbleSort bubblecorrecto2 = new BubbleSort ();
		

		
	@Test
	public void validar() {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bubblecorrecto1.setArr(arr);
		bubblecorrecto1.bubbleSort(arr);
		assertTrue(bubblecorrecto1.comparar());
		
		
		int arr2[] = { 22, 422, 221, 91, 69 };
		bubblecorrecto2.setArr(arr2);
		bubblecorrecto2.bubbleSort(arr2);
		assertTrue(bubblecorrecto2.comparar());
		
		
		
		
		
		
	}

}

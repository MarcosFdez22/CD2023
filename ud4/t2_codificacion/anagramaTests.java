package com.example.project;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class anagramaTests {

	private anagrama anagramacorrecto1 = new anagrama ("cara","arca");
	
	private anagrama anagramacorrecto2 = new anagrama ("lobo","bolo");
	
	private anagrama anagramacorrecto3 = new anagrama ("antecesor","troceasen");
	
	private anagrama anagramaincorrecto1 = new anagrama("lobo","lobos");
	
	private anagrama anagramaincorrecto2 = new anagrama("apurar","amigos");
	
	private anagrama anagramaincorrecto3 = new anagrama("ejecutivo","ejecutiva");
	
	
	@Test
	public void testValida() {
		
		assertTrue(anagramacorrecto1.compararStr());
		
		assertTrue(anagramacorrecto2.compararStr());
		
		assertTrue(anagramacorrecto3.compararStr());
		
		assertFalse(anagramaincorrecto1.compararStr());
		
		assertFalse(anagramaincorrecto2.compararStr());
		
		assertFalse(anagramaincorrecto3.compararStr());
		
	}
	
	
}

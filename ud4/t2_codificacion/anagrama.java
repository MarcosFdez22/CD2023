package com.example.project;
import java.util.Arrays;

public class anagrama {
	  String str1; 
	  String str2;
	  
	  public anagrama (String str1, String str2) {
		  this.str1=str1;
		  this.str2=str2;
		  
	  }
	  
	  public boolean compararStr() {
		  
		  if(str1.length() != str2.length()) {  
			  
			  return false;
			  
		  }
	
	          char[] charArray1 = str1.toCharArray();  
	          char[] charArray2 = str2.toCharArray();  
	      
	          Arrays.sort(charArray1);  
	          Arrays.sort(charArray2);  
	            
	          boolean result = Arrays.equals(charArray1, charArray2);  
	      
	          return result;
	          
	        }  
	        
	  	}

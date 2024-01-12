package proyecto;
import java.util.Scanner;

 
public class Proyecto {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Suma dos números");
       System.out.println("Ingresa el primer número: ");
       int a = sc.nextInt();
       System.out.println("Ingresa el segundo número: ");
       int b = sc.nextInt();
       System.out.println("La suma de: " + a + " y " + b + " es " + (a+b));
       
       
        
    }
    
}
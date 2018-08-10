package montoescrito;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;



import org.junit.jupiter.api.Test;

class montoescrito {

	@Test
	void test() {
		
        System.out.println("ingrese una cifra de cuatro numeros:");
		
	     int numero;
		
		Scanner a = new Scanner(System.in);
		
		 numero = a.nextInt();
		 
		 public static String nletra(int numero) {
			 
			 String cadena= new String();
			 
			 //aca sacamos las unidades de millon
			 if((montoescrito/1000000)>0) {
				 if((montoescrito/1000000)==1) {
					 cadena= "un millon"+nletra(montoescrito%1000000);
				 }
				 else {
					 cadena=nletra(montoescrito/1000000)+"millones"+nletra(montoescrito%1000000);
				 }
			 }
		  
			 
		 }
		 
	}
}

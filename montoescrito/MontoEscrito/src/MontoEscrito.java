import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
class MontoEscrito {

	@Test
	void test() {
		
        System.out.println("ingrese una cifra de cuatro numeros:");
		
	     int numero;
	     int a=0;
		
		Scanner a = new Scanner(System.int);
		
		 numero = a.nextInt();
		 
		 public static String nletra(int numero) {
			 
			 String cadena= new String();
			 
			 //aca sacamos las unidades de millon
			 if((numero/1000000)>0) {
				 if((numero/1000000)==1) {
					 cadena= "un millon"+nletra(numero%1000000);
				 }
				 else {
					 cadena=nletra(numero/1000000)+"millones"+nletra(numero%1000000);
				 }
			 }
			 //aca sacamos las unidades de mil
			 if((numero/1000)>0) {
				 if((numero/1000)==1)
				 {
					 cadena= "mil"+nletra(numero%1000);
				 }
				 else
				 {
					 cadena= nletra(numero/1000)+"mil"+ nletra(numero%1000);
				 }
			 }
			 //aca sacamos las centenas
			 if((numero/100)>0)
			 {
				 if((numero/100)==1)
				 {
					 cadena= "cien"+nletra(numero%100);
				 }
				 else cadena= nletra(numero/100)+"ciento"+ nletra(numero%100);
				 
				 else
				 {import java.util.Scanner;
					 if((numero/100)==5)
					 {
						 cadena="quinientos"+nletra(numer%100);
					 }
					 else
					 {
						 if((numero/100)==9)
						 {
							 cadena="novecientos"+nletra(numero%100);
						 }
						 else
						 {
							 cadena=nletra(numero/100)+"cientos"+ nletra(numero%100);
						 }
					 }
				 }
			 }
			 //aca sacamos las decenas
			 else
			 {
				 if((numero/10)>0)
				 {
					 switch((int)(numero/10))
					 {
					 case 1:
						 switch((int)(numero%10))
						 {
						 case 0: cadena="diez"; break;
						 case 1: cadena="once";break;
						 case 2: cadena="doce";break;
						 case 3: cadena="trece";break;
						 case 4: cadena="catorce";break;
						 case 5: cadena="quince";break;
							 default:
								 cadena="diez y "+nletra(numero%10);break;
						 }
						 break;
					 case 2: 
						 switch((int)(numero%10))
						 {
						 case 0: cadena="veinte";break;
							 default:
								 cadena="veinti"+nletra(numero%10);break;
						 }
						 break;
					 case 3:
						 switch((int)(numero%10))
						 {
						 case 0: cadena="treinta";break;
						 default:
							 cadena="treinta y"+nletra(numero%10);break;
						 }
						 break;
					 case 4:
						 switch((int)(numero%10))
						 {
						 case 0: cadena="cuarenta";break;
						 default:
							 cadena= "cuarenta y"+nletra(numero%10);break;
						 }
						 break;
					 case 5:
						 switch((int)(numero%10))
						 {
						 case 0: cadena= "cincuenta";break;
						 default:
							 cadena="cincuenta y "+nletra(numero%10);break;
						 }
						 break;
					 case 6:
						 switch((int)(numero%10))
						 {
						 case 0: cadena="sesenta";break;
						 default:
							 cadena="sesenta y "+nletra(numero%10);break;
						 }
						 break;
					 case 7:
						 switch((int)(numero%10))
						 {
						 case 0: cadena="setenta";break;
						 default:
							 cadena="setenta y "+nletra(numero%10);break;
						 }
						 break;
					 case 8:
						 switch((int)(numero%10))
						 {
						 case 0: cadena="ochenta";break;
						 default;
						 cadena="ochenta y "+nletra(numero%10);break;
						 }
						 break;
					 case 9:
						 switch((int)(numero%10))
						 {
						 case 0: cadena ="noventa";break;
						 default:
							 cadena="noventa y"+nletra(numero%10);break;
						 }
						 break;
					 }
				 }
			 }
			 else
			 {
				 switch((int)(numero))
				 {
				 case 0: cadena="cero";break;
				 case 1: cadena="uno";break;
				 case 2: cadena="dos";break;
				 case 3: cadena="tres";break;
				 case 4: cadena="cuatro";break;
				 case 5: cadena="cinco";break;
				 case 6: cadena="seis";break;
				 case 7: cadena="siete";break;
				 case 8: cadena="ocho";break;
				 case 9: cadena="nueve";break;
				 }
			 }
			
		 }
		 
	}
}
return cadena;

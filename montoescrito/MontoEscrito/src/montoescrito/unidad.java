package montoescrito;

public class unidad {
	
	public static String unidadEnTexto(int iNumero){
				
		 switch(iNumero){
			case 1:
				return "uno";
			case 2:
				return "dos";
			case 3:
				return "tres";
			case 4:
				return "cuatro";
			case 5:
				return "cinco";
			case 6:
				return "seis";
			case 7:
				return "siete";
			case 8:
				return "ocho";
			case 9:
				return "nueve";
			case 0:
				return "cero";
			default:
				return "";
		 }
	}
}
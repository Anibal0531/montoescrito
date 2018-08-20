package montoescrito;

import org.junit.jupiter.api.Test;

public class Mil {

	public String MilEnTexto(int Mil) {

		switch (Mil) {
		case 1:
			return "mil";
		case 2:
			return "dos mil ";
		case 3:
			return "tres mil";
		case 4:
			return "cuatro mil";
		case 5:
			return "cinco mil";
		case 6:
			return "seis mil";
		case 7:
			return "siete mil";
		case 8:
			return "ocho mil";
		case 9:
			return "nueve mil ";
		default:
			return "";
		}
	}

	public String centenaEnTexto(int centena) {

		switch (centena) {
		case 1:
			return "ciento";
		case 2:
			return "doscientos";
		case 3:
			return "trescientos";
		case 4:
			return "cuatrocientos";
		case 5:
			return "quinientos";
		case 6:
			return "seiscientos";
		case 7:
			return "sietecientos";
		case 8:
			return "ochocientos";
		case 9:
			return "novecientos";
		default:
			return "";
		}
	}

	public String DecenaEnTexto(int iDecena) {
		switch (iDecena) {
		case 1:
			return "diez";
		case 2:
			return "veinte";
		case 3:
			return "treinta";
		case 4:
			return "cuarenta";
		case 5:
			return "cincuenta";
		case 6:
			return "sesenta";
		case 7:
			return "setenta";
		case 8:
			return "ochenta";
		case 9:
			return "noventa";
		default:
			return "";
		}
	}

	public String decenasEnTexto(int decenas) {

		switch (decenas) {
		case 11:
			return "once";
		case 12:
			return "doce";
		case 13:
			return "trece";
		case 14:
			return "cuatorce";
		case 15:
			return "quince";
		case 16:
			return "dieciseis";
		case 17:
			return "diecisiete";
		case 18:
			return "dieciocho";
		case 9:
			return "diecinueve";
		default:
			return "";
		}
	}

	public String unidadEnTexto(int iNumero) {
		switch (iNumero) {
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

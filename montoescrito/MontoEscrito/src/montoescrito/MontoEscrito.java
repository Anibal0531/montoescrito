package montoescrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.lang.String;
import montoescrito.Mil;

class MontoEscrito {
	
	int texto;
	int numero;

	public String Miles(int Miless) {
		Mil MilesTx = new Mil();
		String texto = "";
		if ((Miless / 1000) > 0) {
			if ((Miless / 1000) == 1)
				texto = MilesTx.MilEnTexto(Miless);
		}
		return texto;
	}

	public int centenas(int centenass) {
		Mil CentenaTx = new Mil();
		String texto = "";
		int centenas = numero % 10;
		if ((centenass != 1) && (centenass != 5) && (centenass != 9) && (centenass != 0)) {
			texto = CentenaTx.centenaEnTexto(centenass);
		} else {
			if (centenass == 1) {
				texto = CentenaTx.centenaEnTexto(centenass);
			}
			if ((centenass == 5)) {
				texto = CentenaTx.centenaEnTexto(centenass);
			}
			if (centenass == 9) {
				texto = CentenaTx.centenaEnTexto(centenass);
			}
		}

		return centenas;
	}

	public int Decenas(int Decenas) {
		int decenas1 = numero % 10;
		int numero = 0;
		numero = numero / 10;
		if ((unidad(0) == 0) && (decenas1 > 0)) {
			texto = Decenas(decenas1);
		} else {
			if (Decenas == 1) {
				texto = Decenas(10 + unidad(0));
			} else {
				if (Decenas > 1) {
					texto = Decenas(Decenas);
				}
			}
		}
		return Decenas;
	}
	public int decena(int decena) {
		int decenas1 = numero % 10;
		int numero = 0;
		numero = numero / 10;
		if ((unidad(0) == 0) && (decenas1 > 0)) {
			texto = Decenas(decenas1);
		} else {
			if (decena == 1) {
				texto = decena(10 + unidad(0));
			} else {
				if (decena > 1) {
					texto = decena(decena);
				}
			}
		}
		return decena;
	}

	public int unidad(int unidad) {
		int numero = 0;
		char unidadEnTexto = 0;
		unidad = numero % 10;
		numero = numero / 10;
		texto = unidadEnTexto;
		return unidad;
	}
	
  public String Concatenado(int numero) {
	  String valor;
	  Mil Funciones = new Mil();
	  valor=Funciones.MilEnTexto(numero/1000);
	   valor=valor + Funciones.centenaEnTexto((numero%1000)/100);
	   valor=valor + Funciones.DecenaEnTexto(((numero%1000)%100)/10);
	   valor=valor + Funciones.centenaEnTexto(numero/100);
	   valor=valor + Funciones.decenasEnTexto((numero%100)/100);
	   valor=valor + Funciones.decenasEnTexto((numero%100)/10);
	  
	   //valor=valor + Funciones.unidadEnTexto(numero/10);
	   
	return valor ;
  }
}

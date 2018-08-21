package montoescrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dijitos {

	@Test
	void testcuatrodijitos() {
		MontoEscrito cuatrodijitos = new MontoEscrito();
	    String valoresperado="nueve mil ochocientos veinte";
	    String valorobtenido= cuatrodijitos.Concatenado(9820);
	    assertEquals(valoresperado,valorobtenido);
	}
	void testtresdijitos() {
		MontoEscrito tresdijitos = new MontoEscrito();
	    String valoresperado="doscientos trece";
	    String valorobtenido= tresdijitos.Concatenado(213);
	    assertEquals(valoresperado,valorobtenido);
	    System.out.println(valorobtenido);
	}
}

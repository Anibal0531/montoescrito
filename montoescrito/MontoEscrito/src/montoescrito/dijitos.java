package montoescrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dijitos {

	@Test
	void testcuatrodijitos() {
		MontoEscrito cuatrodijitos = new MontoEscrito();
	    String valoresperado="nueve mil ochocientos";
	    String valorobtenido= cuatrodijitos.Concatenado(9800);
	    assertEquals(valoresperado,valorobtenido);
	}

}

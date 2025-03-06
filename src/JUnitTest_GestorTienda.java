import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest_GestorTienda {

	@Test
	void testCalcularDescuento () {
		        GestorTienda gestor = new GestorTienda();
		        assertEquals(10.0, gestor.calcularDescuento(100.0, 10), 0.01);
		        assertEquals(5.0, gestor.calcularDescuento(100.0, 5), 0.01);
		        assertEquals(0.0, gestor.calcularDescuento(100.0, 4), 0.01);
		    }
	
	@Test
	void testCategorizarProducto() {
				GestorTienda gestor = new GestorTienda();
				assertEquals("Económico", gestor.categorizarProducto(9.99));
		        assertEquals("Estándar", gestor.categorizarProducto(10.0));
		        assertEquals("Estándar", gestor.categorizarProducto(49.99));
		        assertEquals("Premium", gestor.categorizarProducto(50.0));
	}
	@Test
	void testBuscarProducto() {
				GestorTienda gestor = new GestorTienda();
				String[] inventario = {"Reloj", "Termometro", "Harina"};
				assertEquals("Reloj", gestor.buscarProducto(inventario, "Reloj"));
				assertEquals("Termometro", gestor.buscarProducto(inventario, "Termometro"));
				assertEquals("Harina", gestor.buscarProducto(inventario, "Harina"));
				assertNull(gestor.buscarProducto(inventario, null));
	}
	
	}



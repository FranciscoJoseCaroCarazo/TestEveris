package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.helper;

class helperTest {

	@Test
	void testMenuprincipal() {
		fail("Not yet implemented");
	}

	@Test
	void testAniadirVideojuego() {
		fail("Not yet implemented");
	}

	@Test
	void testLeerlista() {
		fail("Not yet implemented");
	}

	@Test
	void testBorrarVideojuego() {
		fail("Not yet implemented");
	}

	@Test
	void testSaber_id() {
		fail("Not yet implemented");
	}

	@Test
	void testSumarNum() {
		helper.sumarNum(10, 10);
		assertEquals(20, helper.sumarNum(10, 10));
	}

	@Test
	void testRestarNum() {
		helper.restarNum(50, 10);
		assertEquals(40, helper.restarNum(50, 10));
	}

}

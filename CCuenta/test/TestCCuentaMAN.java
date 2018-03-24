import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCCuentaMAN {

	@Test
	void testCcuenta() {
		Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
		assertNotNull(miCuenta);
	}

	@Test
	void testSaldoMAN() {
		Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
		double res=miCuenta.getSaldo();
		assertEquals(3200,res);
	}

	@Test
	void testIngresarMAN() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
		miCuenta.ingresar(300);
		assertEquals(3500,miCuenta.getSaldo());
	}
	
	@Test(expected=Exception.class)
	public void testIngresarExceptionMAN() throws Exception{
	Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
	miCuenta.ingresar(-600);
	}

	@Test
	void testRetirarMAN() throws Exception{
		Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
		miCuenta.retirar(200);
		assertEquals(3000,miCuenta.getSaldo());
		
	}

	@Test(expected=Exception.class)
	void testRetirarMasDelSaldoMAN() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
		miCuenta.retirar(3500);
	}

}

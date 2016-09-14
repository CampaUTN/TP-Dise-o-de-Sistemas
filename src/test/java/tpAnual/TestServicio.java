package tpAnual;

import org.junit.*;

public class TestServicio {
	private Servicio rentas = new Servicio("Rentas");
	
	@Before
	public void init(){
		SingletonReseter.resetAll();
	}
	
	@Test
	public void esElMismoSerivio(){
		Assert.assertTrue(rentas.tienePorNombre("Rentas"));
	}
	
	@Test
	public void tomaElNombreEnMayuscula(){
		Assert.assertTrue(rentas.tienePorNombre("RENTAS"));
	}
	
	public void tomaElNombreEnMinuscula(){
		Assert.assertTrue(rentas.tienePorNombre("rentas"));
	}
}

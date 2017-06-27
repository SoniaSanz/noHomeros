package edu.unlam.ar.programacionBasicaDos.pruebas;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.ar.programacionBasicaDos.clases.Bar;
import edu.unlam.ar.programacionBasicaDos.clases.Cliente;

public class BarTest {

	@Test
	public void test() {
		Bar barDeNoHomeros = new Bar();
	
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Homero");
		cliente1.setEdad(40);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Lenny");
		cliente2.setEdad(40);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Carl");
		cliente3.setEdad(40);
		
		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Homero");
		cliente4.setEdad(46);
	
		barDeNoHomeros.ingresarCliente(cliente1);
	}
	
	
	@Test
	public void test2() {
		Bar barDeNoHomeros = new Bar();
		
		barDeNoHomeros.abrirBar();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Homero");
		cliente1.setEdad(46);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Lenny");
		cliente2.setEdad(40);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Carl");
		cliente3.setEdad(29);
		
		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Homero");
		cliente4.setEdad(46);
	
		barDeNoHomeros.ingresarCliente(cliente1);
		barDeNoHomeros.ingresarCliente(cliente2);
		barDeNoHomeros.ingresarCliente(cliente3);
		barDeNoHomeros.ingresarCliente(cliente4);
		
		System.out.println("INGRESAN POR NOMBRE");
		barDeNoHomeros.mostrarCliente();
		
		Assert.assertEquals(3,barDeNoHomeros.getClientes().size());
		Assert.assertEquals("Carl",barDeNoHomeros.getClientes().first().getNombre());
		Assert.assertEquals("Lenny",barDeNoHomeros.getClientes().last().getNombre());


	}
	
	@Test
	public void test3() {
		Bar barDeNoHomeros = new Bar();
		
		barDeNoHomeros.abrirBar();
		
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Carl");
		cliente3.setEdad(29);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Lenny");
		cliente2.setEdad(40);
		
		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Homero");
		cliente4.setEdad(46);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Homero");
		cliente1.setEdad(46);
		
	
		System.out.println("INGRESAN POR EDAD");
		barDeNoHomeros.ingresarClientePorEdad(cliente1);
		barDeNoHomeros.ingresarClientePorEdad(cliente2);
		barDeNoHomeros.ingresarClientePorEdad(cliente3);
		barDeNoHomeros.ingresarClientePorEdad(cliente4);

		barDeNoHomeros.mostrarCliente();
		
		Assert.assertEquals(3,barDeNoHomeros.getClientes().size());
		Assert.assertEquals("Homero",barDeNoHomeros.getClientes().first().getNombre());
		Assert.assertEquals("Carl",barDeNoHomeros.getClientes().last().getNombre());
	}

}

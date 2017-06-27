package edu.unlam.ar.programacionBasicaDos.clases;

import java.util.TreeSet;

public class Bar {
	
	TreeSet <Cliente> clientes = null;
	
	Boolean status = Boolean.FALSE;
	
	public void abrirBar(){
		this.status = Boolean.TRUE;
	}
	
	public void cerrarBar(){
		this.status = Boolean.FALSE;
	}

	public Boolean getStatus() {
		return status;
	}
	
	public void ingresarCliente(Cliente cliente){
		//ComparaPorNombre ordenaPorNombre = new ComparaPorNombre();
		 try {
			 if(this.clientes == null && this.status == Boolean.TRUE){
					clientes = new TreeSet <Cliente>();
				}
			 
			 clientes.add(cliente);
	        }
	        catch (Exception e) {
	            System.out.println("El bar esta cerrado!!");
	        }
	}
	
	public void ingresarClientePorEdad(Cliente cliente){
		ComparaPorEdad ordenaPorEdad = new ComparaPorEdad();
		 try {
			 if(this.clientes == null && this.status == Boolean.TRUE){
					clientes = new TreeSet<Cliente>(ordenaPorEdad);
				}
			 
			 clientes.add(cliente);
	        }
	        catch (Exception e) {
	            System.out.println("El bar esta cerrado!!");
	        }
	}
	
	public void mostrarCliente(){
		try {
				for (Cliente cliente : clientes) {
				    System.out.println(cliente);
				}
	        }
	        catch (Exception e) {
	            System.out.println("El bar esta cerrado o no tiene clientes!!");
	        }
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public TreeSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(TreeSet<Cliente> clientes) {
		this.clientes = clientes;
	}

}

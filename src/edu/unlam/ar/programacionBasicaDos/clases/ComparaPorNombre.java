package edu.unlam.ar.programacionBasicaDos.clases;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Cliente>{

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		return cliente1.getNombre().compareToIgnoreCase(cliente2.getNombre()); 
	}	

}

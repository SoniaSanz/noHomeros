package edu.unlam.ar.programacionBasicaDos.clases;

import java.util.Comparator;

public class ComparaPorEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		if (cliente1.getEdad() > cliente2.getEdad())
			return -1;
		else if (cliente1.getEdad() < cliente2.getEdad())
			return 1;
		return cliente1.getEdad().compareTo(cliente2.getEdad());
	}

}

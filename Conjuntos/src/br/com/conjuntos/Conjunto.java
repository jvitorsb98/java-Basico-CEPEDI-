package br.com.conjuntos;

import java.util.Set;

public class Conjunto {
	private Set<Integer> conjunto;


	public Conjunto() {
		super();
	}
	
	public void preencheSet(Integer... entrada) {
		conjunto = Set.of(entrada);
	}

	public void imprimeConjunto() {
		for(Integer valor : conjunto) {
			System.out.print(valor + " ");
		}
	}

	public Set<Integer> getConjunto() {
		return conjunto;
	}
	
	public boolean valorNoConjunto(Integer valor) {
		return this.conjunto.contains(valor);
	}

	
	
}

package br.com.conjuntos;

import java.util.ArrayList;

public class ListaConjuntos {
	
	ArrayList<Conjunto> listaConjuntos;

	public ListaConjuntos() {
		super();
		this.listaConjuntos = new ArrayList<>();
	}

	public ArrayList<Conjunto> getListaConjuntos() {
		return listaConjuntos;
	}
	
	public void insereConjunto(Conjunto... conjuntos) {
	    for (Conjunto c : conjuntos) {
	        this.listaConjuntos.add(c);
	    }
	}


	
	public void imprimeLista() {
		for(Conjunto conjunto : listaConjuntos) {
			conjunto.imprimeConjunto();
			System.out.println();
		}
	}
	
	public ListaConjuntos conjuntoUnitarios(double percentualMin) {
	    ListaConjuntos listaUnitarios = new ListaConjuntos();
	    for (Conjunto c : this.listaConjuntos) {
	        for (Integer valor : c.getConjunto()) {
	            if (listaUnitarios.contemNaLista(valor) ==0 ) {
	            	if((double)this.contemNaLista(valor)/this.listaConjuntos.size() >= percentualMin) {
		                Conjunto cValor = new Conjunto();
		                cValor.preencheSet(valor);
		                listaUnitarios.insereConjunto(cValor);
	            	}
	            }
	        }
	    }
	    return listaUnitarios;
	}
	
	
	
	public int contemNaLista(Integer valor) {
		int qnt = 0;
		for(Conjunto c : this.listaConjuntos) {
			if(c.valorNoConjunto(valor)) {
				qnt++;
			}
		}
		return qnt;
	}
	
	

	


}

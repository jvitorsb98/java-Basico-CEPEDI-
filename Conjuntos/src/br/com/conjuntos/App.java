package br.com.conjuntos;

public class App {

	public static void main(String[] args) {
		
		Conjunto conj0 = new Conjunto();
		Conjunto conj1 = new Conjunto();
		Conjunto conj2 = new Conjunto();
		Conjunto conj3 = new Conjunto();
		conj0.preencheSet(1,3,4);
		conj1.preencheSet(2,3,5);
		conj2.preencheSet(1,2,3,5);
		conj3.preencheSet(2,5);
		ListaConjuntos lista = new ListaConjuntos();
		lista.insereConjunto(conj0,conj1,conj2,conj3);
		
		ListaConjuntos unitarios = lista.conjuntoUnitarios(0.5);
		unitarios.imprimeLista();
		
	}
	
}

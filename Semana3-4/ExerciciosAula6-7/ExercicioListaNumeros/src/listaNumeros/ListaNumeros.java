package listaNumeros;

import java.util.ArrayList;

public class ListaNumeros {
	
	private ArrayList<Float> lista = new ArrayList<Float>();
	
	public void novoNumero(float numero) {
		lista.add(numero);
	}
	
	public void listaNumeros() {
		for(float valor: lista) {
			System.out.println(valor);
		}
	}
	
	public float media() {
		float media = 0;
		for(float valor:lista) {
			media += valor;
		}
		
		return media / lista.size();
	}
	
	
	public void ordena() {
		lista.sort(null);
	}
	
	public void mostraMediana() throws CloneNotSupportedException {
		System.out.println("Mediana : " + mediana());
	}
	
	private float mediana() throws CloneNotSupportedException {
	    ListaNumeros lista2 = new ListaNumeros();
	    
	    for (float valor : this.getLista()) {
	        lista2.novoNumero(valor);
	    }

	    lista2.ordena();
	    
	    if (lista2.getLista().size() % 2 == 0) {
	        return ((float) lista2.getLista().get(lista2.getLista().size() / 2) +
	                (float) lista2.getLista().get(lista2.getLista().size() / 2 - 1)) / 2;
	    } else {
	        return lista2.getLista().get(lista2.getLista().size() / 2);
	    }
	}
	
	
	public ArrayList<Float> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Float> lista) {
		this.lista = lista;
	}
	
	public void  colocadoEm(int n) {
	    ListaNumeros lista2 = new ListaNumeros();
	    
	    for (float valor : this.getLista()) {
	        lista2.novoNumero(valor);
	    }
	    
	    lista2.ordena();
	    
	    
	    System.out.println("O " + (n) + " maior valor da lista é : " + lista2.getLista().get(lista2.getLista().size()-n));
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ListaNumeros lista = new ListaNumeros();
		lista.novoNumero(8.5F);
		lista.novoNumero(7F);
		lista.novoNumero(25F);
		lista.novoNumero(2F);
		lista.listaNumeros();
		lista.mostraMediana();
		lista.ordena();
		lista.listaNumeros();
		
		lista.colocadoEm(1);
		
	}
	
}

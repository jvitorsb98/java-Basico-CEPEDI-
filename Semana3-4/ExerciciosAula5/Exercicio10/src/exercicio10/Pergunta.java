package exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Pergunta {
	
	private String textoParaPergunta;
	private ArrayList<String> alternativas =  new ArrayList<>();
	
	
	public void mostraPergunta() {
		System.out.println(getTextoParaPergunta() + "?");
	}
	
	public void mostraAlternativas() {
		int tam = getAlternativas().size();
		for(int i = 0 ; i  < tam  ; i++ ) {
			System.out.println((char)(i+65) + getAlternativas().get(i));
		}
	}
	
	public void insereAlternativas() {
		Scanner sc = new Scanner(System.in);
		int qtdAlternativas;
		String alternativa;
		System.out.println("A pergunta terá quantas alternativas ? ");
		 qtdAlternativas = sc.nextInt();
		 sc.nextLine();
		
		 for(int i = 0 ; i < qtdAlternativas ; i++) {
			 System.out.println("Qual sera a alternativa " + (char)(i+65) + " ?" );
			 alternativa = sc.nextLine();
			 getAlternativas().add(alternativa);
		 }
	}
	
	
	public String getTextoParaPergunta() {
		return textoParaPergunta;
	}
	public void setTextoParaPergunta(String textoParaPergunta) {
		this.textoParaPergunta = textoParaPergunta;
	}
	public ArrayList<String> getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	} 
	
	
	
}

package verbo;
import java.util.Scanner;

public class Verbo {
	
	// Atributos

	private String radical;
	private String sufixo;
	
	public static void main(String[] args) {
		String verboText;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do verbo : ");
		verboText = sc.nextLine();
		Verbo verbo = new Verbo(verboText);
		verbo.conjulgar();
		
		sc.close();
	}
	
	
	
	public Verbo(String verbo) {
		this.radical = verbo.substring(0,verbo.length()-2);
		this.sufixo = verbo.substring(verbo.length()-2);
	}
	
	public Verbo() {
		
	}
	
	//Getters e Setters
	
	public String getRadical() {
		return radical;
	}
	public void setRadical(String radical) {
		this.radical = radical;
	}
	public String getSufixo() {
		return sufixo;
	}
	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	@Override
	public String toString() {
		return radical+ sufixo;
	}
	
	public void conjulgar() {
		System.out.println("Eu " + this.radical +"o");
		System.out.println("Tu " + this.radical +"ás");
		System.out.println("Ele " + this.radical +"a");
		System.out.println("Nós " + this.radical +"amos");
		System.out.println("Vós " + this.radical +"aís");
		System.out.println("Eles " + this.radical +"am");
	}
	
	
	
	
}

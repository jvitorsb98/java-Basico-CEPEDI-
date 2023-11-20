package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static int soma(int n1, int n2) {
		return n1+n2;
		
	}
	
	public static void main(String[] args) {
		int n1, n2;
		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero : ");
		n1 =  sc.nextInt();
		System.out.println("Digite o segundo numero : ");
		n2=  sc.nextInt();
		resultado = soma(n1,n2);
		System.out.println("Resultado : " + resultado);
	}

}

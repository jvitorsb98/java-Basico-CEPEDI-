package exercicio7;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		int v1 , v2 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero : ");
		v1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero : ");
		v2 = sc.nextInt();
		
		v1 = v1^v2;
		v2 = v1^v2;
		v1 = v1^v2;
		
		System.out.println("V1 : " + v1 );
		System.out.println("V2 : " + v2 );
	}

}

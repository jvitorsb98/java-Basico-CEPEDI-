package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static String concatena(String s1 , String s2) {
		return s1+s2;
	}
	
	public static void main(String[] args) {
		String s1 , s2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira String : ");
		s1 = sc.nextLine();
		System.out.println("Digite a segunda String : ");
		s2 = sc.nextLine();
		
		System.out.println("Strings concatenadas : " + concatena(s1,s2));
	}

}

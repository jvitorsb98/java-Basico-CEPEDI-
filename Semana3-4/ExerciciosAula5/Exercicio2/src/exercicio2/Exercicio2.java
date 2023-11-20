package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	
	public static double mediaPonderada(double notas_e_pesos[][]) {
		
		double resultado = 0;
		double somaDosPesos=0;
		for(int i = 0 ; i < 3 ; i++) {
			resultado += notas_e_pesos[i][0] * notas_e_pesos[i][1];
			somaDosPesos += notas_e_pesos[i][1];
		}
		System.out.println(resultado);
		return resultado/somaDosPesos;
		
	}
	
	
	public static void main(String[] args) {
		double [][] notas_e_pesos = new double[3][2];
		double resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero : ");
		notas_e_pesos[0][0] =  sc.nextDouble();
		System.out.println("Digite o peso do primeiro numero : ");
		notas_e_pesos[0][1] =  sc.nextDouble();
		System.out.println("Digite o segundo numero : ");
		notas_e_pesos[1][0] =  sc.nextDouble();
		System.out.println("Digite o peso do primeiro numero : ");
		notas_e_pesos[1][1] =  sc.nextDouble();		
		System.out.println("Digite o terceiro numero : ");
		notas_e_pesos[2][0] =  sc.nextDouble();
		System.out.println("Digite o peso do primeiro numero : ");
		notas_e_pesos[2][1] =  sc.nextDouble();
		
		resultado = mediaPonderada(notas_e_pesos);
		System.out.println("Resultado : " + resultado);

	}

}

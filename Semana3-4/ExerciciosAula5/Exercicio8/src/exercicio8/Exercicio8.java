package exercicio8;

import java.util.Scanner;

public class Exercicio8 {
	
	public static int maiorIdade(int idade1, int idade2) {
		return (idade1 > idade2) ? idade1 : idade2; 
	}
	
	public static boolean verificaMaioridade(int idade) {
		return idade >= 18;
	}
	
	public static int calculaIdade(int diaNasc, int mesNasc , int anoNasc ,int diaAtual, int mesAtual ,int anoAtual) {
		
		int idade = anoAtual - anoNasc - 1;
		if(anoNasc  < anoAtual) {
			idade = anoAtual - anoNasc - 1;
		}else if (anoAtual == anoNasc) {
			idade = anoAtual - anoNasc;
		}else {
			System.out.println("Largue de prosa ruim");
			return -1;
		}
		if(mesNasc < mesAtual) {
			idade++;
		}else if ( mesNasc == mesAtual) {
			if(diaNasc <= diaAtual) {
				idade++;
			}
		}
		
	
		return idade;
	}
	
	public static void main(String[] args) {
		int dia,mes,ano;
		int diaA , mesA , anoA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia de Nascimento : ");
		dia = sc.nextInt();
		System.out.println("Mês de Nascimento : ");
		mes = sc.nextInt();
		System.out.println("Ano de Nascimento : ");
		ano = sc.nextInt();
		
		System.out.println("Dia Atual : ");
		diaA = sc.nextInt();
		System.out.println("Mês Atual: ");
		mesA = sc.nextInt();
		System.out.println("Ano Atual : ");
		anoA = sc.nextInt();
		
		
		System.out.println("Idade = " + calculaIdade(dia,mes,ano,diaA,mesA,anoA));
	}

}

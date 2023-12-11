package Exercicios;

import java.util.Scanner;

import ExceptionsDinheiro.ValorInvalidoException;

public class CaixaEletronico {
	
	public static boolean RealizaSaque(){
		Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor a ser sacado : ");
			String valorString = sc.nextLine();
			try {
				int valor = Integer.parseInt(valorString);
				registraSaque(valor);
			}catch(ValorInvalidoException e) {
				System.out.println("Erro " + e );
				return false;
			}catch(Exception e){
				System.out.println("Erro " + e );
				return false;
			}finally {
				sc.close();
			}
			return true;


		
	}
	
	public static void registraSaque(int valor) throws ValorInvalidoException {
		if(valor%10 != 0) {
			throw new ValorInvalidoException(valor);
		} 
	}
	
	public static void main(String[] args) {
		CaixaEletronico.RealizaSaque();
	}

}

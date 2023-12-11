package Exercicios;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ExceptionsIdade.IdadeInvalidaException;

public class Idade {
	
	private int idade;
	private LocalDate dataDeNascimento;
	
	

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	
	public static int calcularIdade(LocalDate dataNascimento) throws IdadeInvalidaException {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idadeAtual = periodo.getYears();
        if(idadeAtual < 0 || idadeAtual > 150) {
        	throw new IdadeInvalidaException(idadeAtual);
        }
        
        return idadeAtual;
        
}

	public static Idade Cadastro() {
		Scanner sc = new Scanner(System.in);
		int idade;
		String dataString;
		
		System.out.println("Digite uma Data de Nascimento(dd/MM/yyyy) : ");
		dataString = sc.nextLine();
				
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
        	LocalDate data = LocalDate.parse(dataString,formate);
    		idade = calcularIdade(data);
    		Idade idadeClass = new Idade();
    		idadeClass.setDataDeNascimento(data);
    		idadeClass.setIdade(idade);
    		return idadeClass;
        }catch(Exception e) {
        	System.out.println("Erro : " + e);
        	return null;
        }
        finally {
        	sc.close();
        }
        
		
	}
	
	
	public static void main(String[] args) {
		Idade i = Idade.Cadastro();
	}

}

package Cliente;

import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome,cpf;
		int idade;
		System.out.println("Digite o nome do cliente : ");
		nome = sc.nextLine();
		System.out.println("Digite o cpf do usuario : ");
		cpf = sc.nextLine();
		Cliente cliente = new Cliente(nome,cpf);
		System.out.println("Digite a idade de " + cliente.getNome() + " :");
		idade = sc.nextInt();
		cliente.setIdade(idade);
		System.out.println(cliente);
	}

}

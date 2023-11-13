package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private int quantidadeDePostagens;
	private int pontuacao;
	private String nome;
	private String nacionalidade;
	private String email;
	private ArrayList<String>postagens;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	public void alteraPontuacao(int delta) {
		this.pontuacao += delta;
		if(this.pontuacao < 0 ) {
			this.pontuacao = 0;
		}
	}
	public void adicionaPostagem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma postagem : ");
		String p = sc.nextLine();
		this.postagens.add(p);
		this.quantidadeDePostagens++;
	}
	
	
	
	@Override
	public String toString() {
		return "Usuario [quantidadeDePostagens=" + quantidadeDePostagens + ", pontuacao=" + pontuacao + ", nome=" + nome
				+ ", nacionalidade=" + nacionalidade + ", email=" + email + "]";
	}
	
	public int getQuantidadeDePostagens() {
		return this.quantidadeDePostagens;
	}
	public void mostraTodasPostagens() {
		System.out.println("----LISTA DE PUBLICAÇÕES----");
		for(String publi:this.postagens) {
			System.out.println(publi);
		}
	}
	
	
	public Usuario(String nome, String nacionalidade, String email) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.email = email;
		this.postagens =  new ArrayList<String>() ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String escolha;
		String nome,email,nacionalidade;
		do {
			System.out.println("Digite o nome de um usuario : ");
			nome = sc.nextLine();
			System.out.println("Digite o email do usuario : ");
			email = sc.nextLine();
			System.out.println("Digite a nacionalidade do usuario : ");
			nacionalidade = sc.nextLine();
			
			Usuario usuario = new Usuario(nome,email,nacionalidade);
			listaUsuarios.add(usuario);
			
			System.out.println("Deseja inserir novos usuarios(s- sim , n - não) ? ");
			escolha = sc.nextLine();	
		}while(escolha.charAt(0)!='n');
		
		for(Usuario user: listaUsuarios) {
			System.out.println(user);

		}
		
		sc.close();
	}
	
	

}

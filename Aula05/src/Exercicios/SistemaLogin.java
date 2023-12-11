package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import ExceptionsCredenciais.AutenticacaoFalhouException;
import ExceptionsCredenciais.CredenciaisInvalidasException;
import ExceptionsCredenciais.UsuarioErradoExpeption;

public class SistemaLogin {
	
	ArrayList<Usuario>  listaUsuarios;
	
	public static void Logar(ArrayList<Usuario>  listaUsuarios, int qntTentativas) {

		String login, senha;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite seu login");
			login = sc.nextLine();
			Usuario u = buscaUusuario(listaUsuarios,login);
			System.out.println("Digite sua senha");
			senha = sc.nextLine();
			SistemaLogin.verificaSenha(u,senha);
			System.out.println("Autenticação concluida");
		}catch(UsuarioErradoExpeption e ) {
			System.out.println("Erro " + e );
			Logar(listaUsuarios,0);
		}catch(AutenticacaoFalhouException e) {
			System.out.println("Erro " + e );
			if(qntTentativas==3) {
				System.out.println("Conta Bloqueada");
				return;
			}else {
				Logar(listaUsuarios,qntTentativas+1);
			}
		}

		sc.close();
	}
	
	
	
	public SistemaLogin() {
		listaUsuarios = new ArrayList<>();
	}

	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}



	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}



	public static Usuario buscaUusuario(ArrayList<Usuario>  listaUsuarios , String login) throws UsuarioErradoExpeption {
		for (Usuario u : listaUsuarios) {
			if(u.getLogin().equals(login)) {
				return u;
			}
		}
		
		throw new UsuarioErradoExpeption();

	}
	
	public static void verificaSenha(Usuario u , String senha) throws AutenticacaoFalhouException {
		if(!u.getSenha().equals(senha)) {
			throw new AutenticacaoFalhouException();
		}
	}


	public static Usuario CadastraUsuario() {
		String login, senha;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite seu login");
			login = sc.nextLine();
			System.out.println("Digite sua senha");
			senha = sc.nextLine();
			validaCredenciais(login,senha);
			Usuario usuario = new Usuario(login,senha);
			return usuario;
		}catch(CredenciaisInvalidasException e) {
			System.out.println("Erro : " + e );
			return CadastraUsuario();
		}
	}
	
	public static void validaCredenciais(String login, String senha) throws CredenciaisInvalidasException {
		if(login.isEmpty() || senha.length() < 6 ) {
			throw new CredenciaisInvalidasException();
		}
	}
	
	public static void cadastramento(ArrayList<Usuario>  listaUsuarios) {
		Usuario usuario = CadastraUsuario();
		listaUsuarios.add(usuario);
	}
	
	public static void main(String[] args) {
		SistemaLogin sistema = new SistemaLogin();
		Usuario u = SistemaLogin.CadastraUsuario();
		sistema.getListaUsuarios().add(u);
		SistemaLogin.Logar(sistema.getListaUsuarios(),0);
	}	
}

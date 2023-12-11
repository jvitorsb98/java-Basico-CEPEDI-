package Exercicios;

public class Usuario {
	
	String login, senha;
	boolean bloqueado;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
		this.bloqueado = false;
	}
	
	

}

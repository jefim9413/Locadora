package Locadora;

public class Funcionario extends Pessoa{
	private String login;
	private String senha;
	
	public Funcionario(String nome, int matricula, String login, String senha) {
		super(nome, matricula);
		this.login = login;
		this.senha = senha;
	}
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

}

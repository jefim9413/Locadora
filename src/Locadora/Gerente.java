package Locadora;

import java.util.Scanner;
import java.util.ArrayList;
import Produto.*;

public class Gerente extends Funcionario{

	private ArrayList<Pessoa>pessoas = new ArrayList<>();
	private ArrayList<Produto>produtos = new ArrayList<>();

	public Gerente(String nome, int matricula, String login, String senha) {
		super(nome, matricula, login, senha);
	}

	public void AddCliente(String nome, int idade, char sexo, String endereco, int matricula) {
		Cliente cliente = new Cliente(endereco, idade,sexo,nome,matricula);
		pessoas.add(cliente);
	}

	public void AddProduto(Produto produto) {
		produtos.add(produto);
	}

	public void AddOperador(String nome, int matricula, String login, String senha) {

	}

	public void ListarCliente() {

	}

	public void ListrProduto() {

	}

	public void ListarOperador() {

	}

	public void BuscarProduto(String codigo) {
		int aux = 0;
		for(Produto i: produtos) {
			if(i.getCodigo().equals(codigo)) {
				System.out.println("Dados do produto"+i);
				aux = 1;
				break;
			}
		}if(aux == 0) {
			System.out.println("Produto inexistente");
		}
	}

	public void BuscarCliente(int matricula) {
		int aux = 0;
		for(Pessoa i: pessoas) {
			if(i.getMatricula()== matricula) {
				System.out.println("Dados do cliente:"+i);
				aux = 1;
				break;
			}
		}
		if(aux == 0) {
			System.out.println("Cliente inexistente");
		}
	}


	public void BuscarOperador(int matricula) {
		int aux = 0;
		for(Pessoa i: pessoas) {
			if(i.getMatricula()==matricula) {
				System.out.println("Dados do operador de sistema:"+i);
				aux= 1;
				break;
			}
		}
		if(aux == 0) {
			System.out.println("Operador não encontrado");
		}
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
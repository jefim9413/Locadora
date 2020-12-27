package Locadora;
import java.util.Scanner;
import java.util.ArrayList;
import Produto.*;
import Repositorio.*;


public class Gerente extends Funcionario{
	RepositorioProdutos produtos;
	RepositorioPessoas pessoas;


	public Gerente(String nome, int matricula, String login, String senha, RepositorioProdutos repProdutos, RepositorioPessoas repPessoas ) {
		super(nome, matricula, login, senha);
		produtos = repProdutos;
		pessoas = repPessoas;
	}

	public void AddCliente(String nome, int idade, String sexo, String endereco, int matricula) {
		Cliente cliente = new Cliente(endereco, idade,sexo,nome,matricula);
		pessoas.adicionar(cliente);
	}

	public void AddProduto(Produto produto) {
		produtos.adicionar(produto);
	}

	public void AddOperador(String nome, int matricula, String login, String senha) {
		Operador_de_sistema operador = new Operador_de_sistema(nome,matricula,login,senha);
		pessoas.adicionar(operador);
	}

	public void ListarCliente() {
		int cont = 0;
		for (Pessoa i : pessoas.getPessoas()) {
			if(i != null){
				System.out.println(i);
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum Cliente Cadastrado !!");
		}
	}

	public void ListarProduto() {
		int cont = 0;
		for (Produto i :produtos.getProdutos()) {
			if(i != null){
				System.out.println(i);
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum Produto Cadastrado !!");
		}
	}

	public void ListarOperador() {
		int cont = 0;
		for (Pessoa i :pessoas.getPessoas()) {
			if(i instanceof Operador_de_sistema){
				System.out.println(i);
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum Operador Cadastrado !!");
		}
	}

	public void BuscarProduto(String codigo) {
		int aux = 0;
		for(Produto i: produtos.getProdutos()) {
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
		for(Pessoa i: pessoas.getPessoas()) {
			if (i instanceof Cliente){
				if(i.getMatricula()== matricula) {
					System.out.println("Dados do cliente:"+i);
					aux = 1;
					break;
				}
			}
		}
		if(aux == 0) {
			System.out.println("Cliente inexistente");
		}
	}


	public void BuscarOperador(int matricula) {
		int aux = 0;
		for(Pessoa i: pessoas.getPessoas()) {

			if (i instanceof Operador_de_sistema){
				if(i.getMatricula()==matricula) {
					System.out.println("Dados do operador de sistema:"+i);
					aux= 1;
					break;
				}
			}
		}
		if(aux == 0) {
			System.out.println("Operador não encontrado");
		}
	}

	public ArrayList<Pessoa> getCliete() {
		ArrayList<Pessoa> ex = new ArrayList<>();
		for (Pessoa i : pessoas.getPessoas()){
			if(i instanceof Cliente){
				ex.add(i);
			}
		}
		return ex;
	}

	public void setCliente(Pessoa cliente) {
		pessoas.adicionar(cliente);
	}
}
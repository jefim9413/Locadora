package Locadora;
import java.util.Scanner;
import java.util.ArrayList;
import Produto.*;


public class Gerente extends Funcionario{

	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Locacao> locacaos = new ArrayList<>();
	private ArrayList<Gerente> geretes = new ArrayList<>();
	private ArrayList<Operador_de_sistema> operadores = new ArrayList<>();

	public Gerente(String nome, int matricula, String login, String senha, ArrayList<Cliente> clientes, ArrayList<Produto> produtos, ArrayList<Locacao> locacao, ArrayList<Gerente> geretes, ArrayList<Operador_de_sistema> operadores) {
		super(nome, matricula, login, senha);
		this.produtos = produtos;
		this.clientes = clientes;
		this.locacaos = locacao;
		this.geretes = geretes;
		this.operadores = operadores;
	}

	public void AddCliente(String nome, int idade, char sexo, String endereco, int matricula) {
		Cliente cliente = new Cliente(endereco, idade,sexo,nome,matricula);
		clientes.add(cliente);
	}

	public void AddProduto(Produto produto) {
		produtos.add(produto);
	}

	public void AddOperador(String nome, int matricula, String login, String senha) {
		Operador_de_sistema operador = new Operador_de_sistema(nome,matricula,login,senha,clientes,produtos,locacaos);
		operadores.add(operador);
	}

	public void ListarCliente() {
		int cont = 0;
		for (Cliente i : clientes) {
			if(i != null){
				i.toString();
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum Cliente Cadastrado !!");
		}
	}

	public void ListarProduto() {
		int cont = 0;
		for (Produto i :produtos) {
			if(i != null){
				i.toString();
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum Produto Cadastrado !!");
		}
	}

	public void ListarOperador() {
		int cont = 0;
		for (Operador_de_sistema i :operadores) {
			if(i != null){
				i.toString();
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum Operador Cadastrado !!");
		}
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
		for(Cliente i: clientes) {
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
		for(Cliente i: clientes) {
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

	public ArrayList<Cliente> getCliete() {
		return clientes;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.clientes = cliente;
	}
}
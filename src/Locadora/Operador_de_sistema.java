package Locadora;

import Produto.*;
import Repositorio.*;

import java.util.ArrayList;

public class Operador_de_sistema extends Funcionario{
	private ArrayList <Cliente> clientes = new ArrayList<>();
	private ArrayList <Produto> produtos = new ArrayList<>();
	private ArrayList <Locacao> locacaes = new ArrayList<>();
	private repositorioLocacao lista;


	public Operador_de_sistema(String nome, int matricula, String login, String senha, ArrayList<Cliente> clientes , ArrayList<Produto> produtos ,ArrayList<Locacao> locacao ) {
		super(nome, matricula, login, senha);
		this.clientes = clientes;
		this.produtos = produtos;
		this.locacaes = locacao;
		lista = new repositorioLocacao(locacaes);
	}
	
	public void AlugarProduto(String codigo, int matricula) {
		int cont =0;
		for (Produto i: produtos) {
			if(i.getCodigo().equals(codigo)){
				cont = 1;
				for (Cliente j: clientes ) {
					if(j.getMatricula() == matricula){
						Locacao locacao = new Locacao(codigo,matricula);
						locacaes.add(locacao);
						lista.adicionar(locacao);
						cont = 1;
						break;
					}
				}
				if(cont == 0){
					System.out.println("Matricula Não Encontrada !!!");
				}
			}
		}
		if(cont == 0){
			System.out.println("Codigo Não Incontrado!!!");
		}
	}
	
	public void ExcluirLocacao(String codigo) {
		int cont = 0;
		for (Produto i : produtos) {
			if(i.getCodigo().equals(codigo)){
				for (Locacao j : locacaes ) {
					if(j.getCodigo().equals(codigo)){
						lista.remover(codigo,j.getMatricula());
						cont = 1;
					}
				}
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Locação não encontrada!!");
		}
	}
	
	public void BaixaDeLocacao(String codigo) {
		
	}
	
	public void BuscarProduto(String codigo) {
		int cont = 0;
		for (Locacao i: locacaes) {
			if(i.getCodigo().equals(codigo)){
				lista.buscar(codigo,i.getMatricula());
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Produto não encontrado!!!");
		}
	}
	
	public void BscarCliente(int matricula) {
		int cont = 0;
		for (Cliente i: clientes) {
			if(i.getMatricula() == matricula){
				i.toString();
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Cliente não encontrado !!");
		}
	}
}
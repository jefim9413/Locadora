package Locadora;

import Produto.*;
import Repositorio.*;

import java.util.ArrayList;

public class Operador_de_sistema extends Funcionario{
	private RepositorioProdutos produtos;
	private RepositorioPessoas pessoas;
	private repositorioLocacao locacoes;


	public Operador_de_sistema(String nome, int matricula, String login, String senha) {
		super(nome, matricula, login, senha);
	}
	public void iniciar(RepositorioPessoas pessoas , repositorioLocacao locacao , RepositorioProdutos produtos){
		this.produtos = produtos;
		this.pessoas = pessoas;
		this.locacoes = locacao;
	}
	
	public void AlugarProduto(String codigo, int matricula) {
		int cont =0;
		for (Produto i: produtos.getProdutos()) {
			if(i.getCodigo().equals(codigo)){
				cont = 1;
				for (Pessoa j: pessoas.getPessoas()) {
					if(j.getMatricula() == matricula){
						Locacao locacao = new Locacao(codigo,matricula);
						locacoes.adicionar(locacao);
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
		for (Produto i : produtos.getProdutos()) {
			if(i.getCodigo().equals(codigo)){
				for (Locacao j : locacoes.getLocacoes() ) {
					if(j.getCodigo().equals(codigo)){
						locacoes.remover(codigo,j.getMatricula());
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
		for (Locacao i: locacoes.getLocacoes()) {
			if(i.getCodigo().equals(codigo)){
				locacoes.buscar(codigo,i.getMatricula());
				cont = 1;
			}
		}
		if(cont == 0){
			System.out.println("Produto não encontrado!!!");
		}
	}
	
	public void BscarCliente(int matricula) {
		int cont = 0;
		for (Pessoa i: pessoas.getPessoas()) {
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
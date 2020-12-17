package Repositorio;

import java.util.ArrayList;

public class Operador_de_sistema extends Funcionario{
	private ArrayList <Pessoa> pessoas = new ArrayList<>();
	private ArrayList <Produto> produtos = new ArrayList<>();
	private ArrayList <Locacao> locacaes = new ArrayList<>();
	private  repositorioLocacao  lista;


	public Operador_de_sistema(String nome, int matricula, String login, String senha, ArrayList<Pessoa> pessoas , ArrayList<Produto> produtos ,ArrayList<Locacao> locacao ) {
		super(nome, matricula, login, senha);
		this.pessoas = pessoas;
		this.produtos = produtos;
		this.locacaes = locacao;
		lista = new repositorioLocacao(locacaes);
	}
	
	public void AlugarProduto(String codigo, int matricula) {
		int cont =0;
		for (Produto i: produtos) {
			if(i.getCodigo().equals(codigo)){
				cont = 1;
				for (Pessoa j: pessoas ) {
					if(j.getMatricula() == matricula){
						Locacao locacao = new Locacao(codigo,matricula);
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
		
	}
	
	public void BaixaDeLocacao(String codigo) {
		
	}
	
	public void BuscarProduto(String codigo) {
		
	}
	
	public void BscarCliente(int matricula) {
		
	}
}

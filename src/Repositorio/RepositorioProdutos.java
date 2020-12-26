package Repositorio;
import Produto.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepositorioProdutos {
	private ArrayList<Produto> produtos;

	public RepositorioProdutos() {
		produtos = new ArrayList<>();
	}

	public void adicionar(Produto produto) {
		produtos.add(produto);
	}

	public void remover(String codigo) {
		produtos.remove(codigo);
	}

	public Produto buscar(String codigo) {
		for (Produto i : produtos) {
			if(i.getCodigo().equals(codigo)){
				return i;
			}
		}
		return null;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}

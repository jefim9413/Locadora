package Locadora;
import java.util.HashMap;
import java.util.Map;

public class RepositorioProdutos {
	private Map<String, Produto> produtos;
	
	public RepositorioProdutos() {
		produtos = new HashMap<>();
	}
	
	public void adicionar(Produto produto) {
		produtos.put(produto.getCodigo(), produto);
	}
	
	public void remover(String codigo) {
		produtos.remove(codigo);
	}
	
	public Produto buscar(String codigo) {
		return produtos.get(codigo);
	}

	public Map<String, Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Map<String, Produto> produtos) {
		this.produtos = produtos;
	}
}

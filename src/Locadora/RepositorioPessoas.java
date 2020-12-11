package Locadora;
import java.util.HashMap;
import java.util.Map;


public class RepositorioPessoas {
	private Map<Integer, Pessoa> pessoas;
	
	public RepositorioPessoas() {
		pessoas = new HashMap<>();
	}
    
	public void adicionar(Pessoa pessoa) {
		pessoas.put(pessoa.getMatricula(), pessoa);
	}
	
	public void remover(int matricula) {
		pessoas.remove(matricula);
	}
	
	public Pessoa buscar(int matricula) {
		return pessoas.get(matricula);
	}
	
	public Map<Integer, Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Map<Integer, Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
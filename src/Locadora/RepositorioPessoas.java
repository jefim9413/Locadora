import java.util.HashMap;
import java.util.Map;

public class RepositorioPessoas {
	private Map<int, Pessoa> pessoas;
	
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
	
	public Map<String, Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Map<String, Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
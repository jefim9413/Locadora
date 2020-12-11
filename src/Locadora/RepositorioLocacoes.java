import java.util.ArrayList;
import java.util.List;

public class RepositorioLocacoes {
	private List<Locacao> locacoes;
	
	public RepositorioLocacoes() {
		locacoes = new ArrayList<>();
	}
	
	public void adicionar(Locacao locacao) {
		locacoes.add(locacao);
	}
	
	public void remover(String codigo, int matricula) {
		for(Locacao i : locacoes) {
			if((i.getCodigo().equals(codigo)) && (i.getMatricula() == matricula)) {
				locacoes.remove(i);
				break;
			}
		}
	}
	
	public Locacao buscar(String codigo, int matricula) {
		for(Locacao i : locacoes) {
			if((i.getCodigo().equals(codigo)) && (i.getMatricula() == matricula)) {
				return i;
			}
		}
		return null;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
}

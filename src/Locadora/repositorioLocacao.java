package Locadora;
import java.util.List;

public class repositorioLocacao {
    private List<Locacao> locacoes;

    public repositorioLocacao(List<Locacao> locacoes) {
        this.locacoes = locacoes;
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

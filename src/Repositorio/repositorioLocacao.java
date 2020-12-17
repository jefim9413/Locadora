package Locadora;
import java.util.ArrayList;
import java.util.List;

public class repositorioLocacao {
    private ArrayList<Locacao> locacoes;

    public repositorioLocacao(){

    }

    public repositorioLocacao(ArrayList<Locacao> locacoes) {
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

    public ArrayList<Locacao> getLocacoes() {
        return this.locacoes;
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
        this.locacoes = locacoes;
    }


}

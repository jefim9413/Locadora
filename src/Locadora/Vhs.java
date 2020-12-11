package Locadora;
public class Vhs extends Filme {
    private boolean cores;
    
    public Vhs(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, boolean cores) {
		super(codigo, titulo, genero, locado, anoLancamento, duracao);
		this.cores = cores;
	}
	
    public boolean getCores() {
        return (this.cores);
    }
    public void setCores(boolean cores) {
        this.cores = cores;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}



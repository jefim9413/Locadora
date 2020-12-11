package Locadora;
public abstract class Musica extends Produto {
    
	protected String autor;
    protected int numFaixas;
    
    
    public Musica(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas) {
		super(codigo, titulo, genero, locado);
		this.autor = autor;
		this.numFaixas = numFaixas;
	}
    
    public double calcularDiaria() {
    	return 0;
    	}
}

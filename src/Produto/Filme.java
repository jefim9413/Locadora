package Repositorio;
public abstract class Filme extends Produto {
    protected int anoLancamento;
    protected int duracao;
    

    public Filme(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao) {
		super(codigo, titulo, genero, locado);
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
	}


    public double calcularDiaria() {return 0;}
}

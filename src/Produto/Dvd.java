package Repositorio;
public class Dvd extends Filme {
   protected boolean arranhado; 
   
   public Dvd(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, boolean arranhado) {
		super(codigo, titulo, genero, locado, anoLancamento, duracao);
		this.arranhado = arranhado;
	}

	@Override
	public double calcularDiaria() {
	 	return 0;
	}
}

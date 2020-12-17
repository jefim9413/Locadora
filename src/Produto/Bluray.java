package Repositorio;
import java.util.ArrayList;

public class Bluray extends Filme {
    
	private ArrayList<String> idiomas;
	
	public Bluray(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, ArrayList<String> idiomas) {
		super(codigo, titulo, genero, locado, anoLancamento, duracao);
		this.idiomas = new ArrayList<>();
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}

	@Override
	public double calcularDiaria() {
		return 0;
	}
}

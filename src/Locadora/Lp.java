package Locadora;
public class Lp extends Musica {
    private boolean raro;
    
    public Lp(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas, boolean raro) {
		super(codigo, titulo, genero, locado, autor, numFaixas);
		this.raro = raro;
	}
	

    public boolean getRaro() {
        return (this.raro);
    }
    public void setRaro(boolean raro) {
        this.raro = raro;
    }
}

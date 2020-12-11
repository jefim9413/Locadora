package Locadora;
public class Cd extends Musica {
   private boolean arranhado;
    private boolean duplo;
    
    public Cd(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas, boolean arranhado, boolean duplo) {
		super(codigo, titulo, genero, locado, autor, numFaixas);
		this.arranhado = arranhado;
		this.duplo = duplo;
	}
	

    public boolean getArranhado() {
        return (this.arranhado);
    }
    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }
    public boolean getDuplo() {
        return (this.duplo);
    }
    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }
}

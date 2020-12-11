package Locadora;
public abstract class Produto {
    protected String codigo;
    protected String titulo;
    protected String genero;
    protected boolean locado;

    public Produto(String codigo, String titulo, String genero, boolean locado) {
    	this.codigo = codigo;
    	this.titulo = titulo;
    	this.genero = genero;
    	this.locado = locado;
    }


    //métodos abstratos
    public abstract double calcularDiaria();
}

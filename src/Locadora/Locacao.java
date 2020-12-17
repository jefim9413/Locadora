package Locadora;
import java.util.Date;
public class Locacao {
    private String codigo;
    private int matricula;
    private Date saida;
    private Date entrega;

    public Locacao(String codigo, int matricula) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.saida = new Date(System.currentTimeMillis());
        this.entrega.setDate(saida.getDate()+ 7);
    }

    public double calcularMulta() {
        return 0;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Date getSaida() {
        return saida;
    }
    public void setSaida(Date saida) {
        this.saida = saida;
    }
    public Date getEntrega() {
        return entrega;
    }
    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }
}


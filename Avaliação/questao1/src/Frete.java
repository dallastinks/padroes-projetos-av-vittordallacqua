import java.util.List;

public abstract class Frete {

    protected double valorCarga;
    protected String cliente;

    protected Frete(double valorCarga, String cliente) {
        this.valorCarga = valorCarga;
        this.cliente = cliente;
    }

    public final String getCliente() {
        return cliente;
    }

    public abstract double calcularValor();

    public abstract String getModalidade();

    public abstract List<String> getDocumentos();
}
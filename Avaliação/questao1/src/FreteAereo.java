import java.util.Arrays;
import java.util.List;

public class FreteAereo extends Frete {

    public FreteAereo(double valorCarga, String nomeCliente) {
        super(valorCarga, nomeCliente);
    }

    @Override
    public double calcularValor() {
        return valorCarga * 0.06;
    }

    @Override
    public String getModalidade() {
        return "Aéreo";
    }

    @Override
    public List<String> getDocumentos() {
        return Arrays.asList("AWB (Air Waybill)");
    }
}

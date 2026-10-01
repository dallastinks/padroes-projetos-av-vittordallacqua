import java.util.Arrays;
import java.util.List;

public class FreteMaritimo extends Frete {

    public FreteMaritimo(double valorCarga, String nomeCliente) {
        super(valorCarga, nomeCliente);
    }

    @Override
    public double calcularValor() {
        return valorCarga * 0.01;
    }

    @Override
    public String getModalidade() {
        return "Marítimo";
    }

    @Override
    public List<String> getDocumentos() {
        return Arrays.asList("BL (Bill of Lading)", "Fatura comercial");
    }
}

import java.util.Arrays;
import java.util.List;

public class FreteRodoviario extends Frete {

    public FreteRodoviario(double valorCarga, String nomeCliente) {
        super(valorCarga, nomeCliente);
    }

    @Override
    public double calcularValor() {
        return valorCarga * 0.02;
    }

    @Override
    public String getModalidade() {
        return "Rodoviário";
    }

    @Override
    public List<String> getDocumentos() {
        return Arrays.asList("CT-e", "MDF-e");
    }
}

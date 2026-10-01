public class ContratacaoAerea extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(double valorCarga, String cliente) {
        return new FreteAereo(valorCarga, cliente);
    }
}

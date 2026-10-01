public class ContratacaoRodoviaria extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(double valorCarga, String cliente) {
        return new FreteRodoviario(valorCarga, cliente);
    }
}

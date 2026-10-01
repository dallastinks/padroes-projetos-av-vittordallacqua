public class ContratacaoMaritima extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(double valorCarga, String cliente) {
        return new FreteMaritimo(valorCarga, cliente);
    }
}

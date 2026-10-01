public class FabricaMexico implements FabricaArtefatos {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new CfdiMexico();
    }

    @Override
    public Pagamento criarPagamento() {
        return new SpeiMexico();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new LfpdpppMexico();
    }
}
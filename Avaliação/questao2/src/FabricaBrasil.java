public class FabricaBrasil implements FabricaArtefatos {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NfseBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PixBrasil();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new LgpdBrasil();
    }
}
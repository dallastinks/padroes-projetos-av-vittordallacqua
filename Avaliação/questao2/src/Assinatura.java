public class Assinatura {

    private final ComprovanteFiscal comprovanteFiscal;
    private final Pagamento pagamento;
    private final TermoPrivacidade termoPrivacidade;

    public Assinatura(FabricaArtefatos fabrica) {
        this.comprovanteFiscal = fabrica.criarComprovanteFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.termoPrivacidade = fabrica.criarTermoPrivacidade();
    }

    public void ativar() {
        System.out.println("Assinatura ativada.");
        System.out.println(comprovanteFiscal.descricao());
        System.out.println(pagamento.descricao());
        System.out.println(termoPrivacidade.descricao());
    }
}
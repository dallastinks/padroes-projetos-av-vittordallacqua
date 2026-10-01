public class Main {

    public static void main(String[] args) {

        ContratacaoFrete rodoviaria = new ContratacaoRodoviaria();
        ContratacaoFrete aerea = new ContratacaoAerea();
        ContratacaoFrete maritima = new ContratacaoMaritima();

        rodoviaria.contratar(10000.00, "Bring Me The Horizon");
        aerea.contratar(20000.00, "Slayer");
        maritima.contratar(30000.00, "Whitesnake");
    }
}

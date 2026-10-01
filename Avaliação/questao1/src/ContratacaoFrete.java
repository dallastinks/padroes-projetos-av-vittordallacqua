public abstract class ContratacaoFrete {

    public final void contratar(double valorCarga, String nomeCliente) {
        Frete frete = criarFrete(valorCarga, nomeCliente);

        double valorFrete = frete.calcularValor();

        System.out.println("=================================");
        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + frete.getCliente());
        System.out.printf("Valor do frete: R$ %.2f%n", valorFrete);
        System.out.println("Documentos: " + String.join(", ", frete.getDocumentos()));
        System.out.println("=================================");
        System.out.println();
    }

    protected abstract Frete criarFrete(double valorCarga, String nomeCliente);
}

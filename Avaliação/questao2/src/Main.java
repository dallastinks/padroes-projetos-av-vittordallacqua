public class Main {

    public static void main(String[] args) {

        System.out.println("=== Assinatura Brasil ===");
        FabricaArtefatos fabricaBrasil = new FabricaBrasil();
        Assinatura assinaturaBrasil = new Assinatura(fabricaBrasil);
        assinaturaBrasil.ativar();

        System.out.println();

        System.out.println("=== Assinatura México ===");
        FabricaArtefatos fabricaMexico = new FabricaMexico();
        Assinatura assinaturaMexico = new Assinatura(fabricaMexico);
        assinaturaMexico.ativar();
    }
}
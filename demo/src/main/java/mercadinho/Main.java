package mercadinho;

public class Main {
    public static void main(String[] args) {
        AtracaoFestival forro = new AtracaoFestival("Forró Pé de Serra", "20:00", 3000.0, 40.0, 200);
        AtracaoFestival quadrilha = new AtracaoFestival("Quadrilha Junina", "19:00", 800.0, 15.0, 100);
        AtracaoFestival fogos = new AtracaoFestival("Show de Fogos", "23:00", 1500.0, 10.0, 500);
        AtracaoFestival parque = new AtracaoFestival("Parque de Diversões", "18:00", 2000.0, 25.0, 50);

        ProgramacaoArraia programacao = new ProgramacaoArraia();
        programacao.adicionarAtracao(forro);
        programacao.adicionarAtracao(quadrilha);
        programacao.adicionarAtracao(fogos);
        programacao.adicionarAtracao(parque);
        programacao.listarProgramacao();

        CaixaDoArraia caixa = new CaixaDoArraia();

        System.out.println();
        System.out.println("=== Vendas ===");
        vender(forro, 3, caixa);
        vender(forro, 2, caixa);
        vender(quadrilha, 4, caixa);
        vender(parque, 10, caixa);

        System.out.println();
        System.out.println("=== Tentativa acima da capacidade ===");
        vender(parque, 100, caixa);

        System.out.println();
        System.out.println("=== Receita por atração ===");
        System.out.println(forro.getNome() + ": R$ " + forro.calcularReceita());
        System.out.println(quadrilha.getNome() + ": R$ " + quadrilha.calcularReceita());
        System.out.println(fogos.getNome() + ": R$ " + fogos.calcularReceita());
        System.out.println(parque.getNome() + ": R$ " + parque.calcularReceita());

        System.out.println();
        System.out.println("Total de ingressos emitidos: " + Ingresso.getTotalEmitido());
        System.out.printf("Saldo geral do arraiá: R$ %.2f%n", CaixaDoArraia.consultarSaldoGeral());
    }

    private static void vender(AtracaoFestival atracao, int quantidade, CaixaDoArraia caixa) {
        if (atracao.venderIngresso(quantidade)) {
            for (int i = 0; i < quantidade; i++) {
                Ingresso ingresso = new Ingresso(atracao.getNome(), atracao.getValorIngresso());
                caixa.registrarVenda(ingresso.getValorPago());
                System.out.println("Ingresso #" + ingresso.getNumero() + " - " + ingresso.getNomeAtracao()
                        + " - R$ " + ingresso.getValorPago());
            }
        } else {
            System.out.println("Venda recusada: " + atracao.getNome() + " só tem "
                    + atracao.getIngressosDisponiveis() + " ingressos disponíveis.");
        }
    }
}

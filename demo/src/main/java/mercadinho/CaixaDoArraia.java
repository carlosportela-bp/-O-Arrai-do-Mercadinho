package mercadinho;

public class CaixaDoArraia {
    private static double saldoGeral = 0.0;
    private static final double TAXA_SERVICO = 0.05;

    public void registrarVenda(double valor) {
        saldoGeral += valor - (valor * TAXA_SERVICO);
    }

    public static double consultarSaldoGeral() {
        return saldoGeral;
    }
}

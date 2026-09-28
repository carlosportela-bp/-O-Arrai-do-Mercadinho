package mercadinho;

public class Ingresso {
    private static int contadorGeral = 0;

    private int numero;
    private String nomeAtracao;
    private double valorPago;

    public Ingresso(String nomeAtracao, double valorPago) {
        this.numero = contadorGeral + 1;
        contadorGeral++;
        this.nomeAtracao = nomeAtracao;
        this.valorPago = valorPago;
    }

    public int getNumero() { return numero; }
    public String getNomeAtracao() { return nomeAtracao; }
    public double getValorPago() { return valorPago; }

    public static int getTotalEmitido() {
        return contadorGeral;
    }
}

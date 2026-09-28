package mercadinho;

public class CaixaDoArraia {
   private static double saldoGeral;
   private static double TAXA_SERVICO;

   public static void registrarVenda(double valor)
   {
        saldoGeral += valor - TAXA_SERVICO;
   }
   public static double consultarSaldoGeral()
   {
    System.out.println(saldoGeral);
    return saldoGeral;
   }
}

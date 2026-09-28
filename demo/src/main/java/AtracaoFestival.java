package mercadinho;

public class AtracaoFestival {
    private String nome;
    private String horario;
    private double cache;
    private double valorIngresso;
    private int capacidadePublico;
    private int ingressosVendidos;

    public AtracaoFestival(String nome, String horario, double cache,
                           double valorIngresso, int capacidadePublico) {
        this.nome = nome;
        this.horario = horario;
        this.cache = cache;
        this.valorIngresso = valorIngresso;
        this.capacidadePublico = capacidadePublico;
        this.ingressosVendidos = 0;
    }

    public boolean venderIngresso(int quantidade) {
        if (quantidade > 0 && this.ingressosVendidos + quantidade <= this.capacidadePublico) {
            this.ingressosVendidos += quantidade;
            double valorVenda = this.valorIngresso * quantidade;
            CaixaDoArraia.registrarVenda(valorVenda);
            return true;
        }
        return false;
    }

    public int getIngressosDisponiveis() {
        return this.capacidadePublico - this.ingressosVendidos;
    }

    public double calcularReceita() {
        return this.valorIngresso * this.ingressosVendidos;
    }

    public String getNome() { return nome; }
    public String getHorario() { return horario; }
    public double getCache() { return cache; }
    public double getValorIngresso() { return valorIngresso; }
    public int getCapacidadePublico() { return capacidadePublico; }
    public int getIngressosVendidos() { return ingressosVendidos; }

    public void setNome(String nome) { this.nome = nome; }
    public void setHorario(String horario) { this.horario = horario; }

    public void setValorIngresso(double valorIngresso) {
        if (valorIngresso > 0) {
            this.valorIngresso = valorIngresso;
        }
    }
}
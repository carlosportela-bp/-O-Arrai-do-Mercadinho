package mercadinho;

public class AtracaoFestival {
    private String nome;
    private String horario;
    private double cache;
    private double valorIngresso;
    private int capacidadePublico;
    private int ingressosVendidos;

    public AtracaoFestival() {
        this.nome = "Atração sem nome";
        this.horario = "00:00";
        this.cache = 0.0;
        this.valorIngresso = 0.0;
        this.capacidadePublico = 0;
        this.ingressosVendidos = 0;
    }

    public AtracaoFestival(String nome, String horario, double cache,
                           double valorIngresso, int capacidadePublico) {
        this();
        this.nome = nome;
        this.horario = horario;
        this.cache = cache;
        this.valorIngresso = valorIngresso;
        this.capacidadePublico = capacidadePublico;
    }

    public boolean venderIngresso(int quantidade) {
        if (quantidade > 0 && this.ingressosVendidos + quantidade <= this.capacidadePublico) {
            this.ingressosVendidos += quantidade;
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
}

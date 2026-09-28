package mercadinho;

public class ProgramacaoArraia {
    private static final int MAX_ATRACOES = 10;

    private AtracaoFestival[] atracoes;
    private int quantidadeAtual;

    public ProgramacaoArraia() {
        this.atracoes = new AtracaoFestival[MAX_ATRACOES];
        this.quantidadeAtual = 0;
    }

    public boolean adicionarAtracao(AtracaoFestival atracao) {
        if (quantidadeAtual < MAX_ATRACOES) {
            atracoes[quantidadeAtual] = atracao;
            quantidadeAtual++;
            return true;
        }
        return false;
    }

    public void listarProgramacao() {
        System.out.println("=== Programação do Arraiá ===");
        for (int i = 0; i < quantidadeAtual; i++) {
            System.out.println(atracoes[i].getHorario() + " - " + atracoes[i].getNome());
        }
    }

    public AtracaoFestival buscarPorNome(String nome) {
        for (int i = 0; i < quantidadeAtual; i++) {
            if (atracoes[i].getNome().equalsIgnoreCase(nome)) {
                return atracoes[i];
            }
        }
        return null;
    }
}

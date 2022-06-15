public class Cliente {
    private int id;
    private String nome;
    private int dividasPagas;
    private int dividasTotal;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.dividasPagas = 0;
        this.dividasTotal = 500;
    }

    public void pagarDividas(int dividas) {
        dividasPagas += dividas;
        EscritorioContabil.atualizarDinheiroTotal(dividasPagas);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDividasPagas() {
        return dividasPagas;
    }

    public int getDividasTotal() {
        return dividasTotal;
    }

    public int dividasRestantes() {
        return dividasTotal - dividasPagas;
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + nome + " dívida total paga até então: R$";
    }

}

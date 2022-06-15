public class Contador {
    private int id;
    private String nome;
    private int salario;
    private int salarioGanho;

    public Contador(int id, String nome, int salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.salarioGanho = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void receberSalario(int salario) {
        salarioGanho += salario;
        EscritorioContabil.atualizarDinheiroGasto(salario);
    }

    @Override
    public String toString() {
        return "Nome do contador: " + nome
                + " Total de salário ganho até então: R$"
                +salarioGanho;
    }
}

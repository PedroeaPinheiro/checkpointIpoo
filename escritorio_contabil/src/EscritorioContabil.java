import java.util.List;

public class EscritorioContabil {
    private List <Cliente> clientes;
    private List <Contador> contadores;
    private static int dinheiroTotal;
    private static int dinheiroGasto;

    public EscritorioContabil(List<Cliente> clientes, List<Contador> contadores) {
        this.clientes = clientes;
        this.contadores = contadores;
        dinheiroTotal = 0;
        dinheiroGasto = 0;
    }

    public List<Contador> getContadores() {
        return contadores;
    }

    public void cadastrarContador(Contador contador) {
        contadores.add(contador);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public int getDinheiroTotal() {
        return dinheiroTotal;
    }

    public static void atualizarDinheiroTotal(int dinheiroGanho) {
        dinheiroTotal += dinheiroGanho;
    }

    public int getDinheiroGasto() {
        return dinheiroGasto;
    }

    public static void atualizarDinheiroGasto(int dinheiroGasto) {
        dinheiroTotal -= dinheiroGasto;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contador contador1 = new Contador(1, "Maria", 10000);
        Contador contador2 = new Contador(2, "João", 9000 );
        Contador contador3 = new Contador(3, "Jonathan", 6000);

        List<Contador> contadorList = new ArrayList<>();
        contadorList.add(contador1);
        contadorList.add(contador2);
        contadorList.add(contador3);

        Cliente cliente1 = new Cliente(1, "Matheus");
        Cliente cliente2 = new Cliente(2, "Elizabeth");
        Cliente cliente3 = new Cliente(3, "Larissa");

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cliente1);
        clienteList.add(cliente2);
        clienteList.add(cliente3);

        EscritorioContabil contabilidade1 = new EscritorioContabil(clienteList, contadorList);

        cliente1.pagarDividas(2000);
        cliente2.pagarDividas(1000);
        cliente3.pagarDividas(1500);
        System.out.println("Os clientes " + cliente1.getNome() +
                ", " + cliente2.getNome() +
                " e " + cliente3.getNome() +
                " pagaram R$" +
                contabilidade1.getDinheiroTotal() + " para o escritorio.");

    }
}

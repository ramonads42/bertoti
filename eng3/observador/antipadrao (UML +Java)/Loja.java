import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    
    private List<Cliente> clientes;

    public Loja(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void inscrever(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("[" + this.nome + "] O cliente '" + cliente.getNome() + "' foi adicionado à lista de e-mails.");
    }

    public void desinscrever(Cliente cliente) {
        this.clientes.remove(cliente);
        System.out.println("[" + this.nome + "] O cliente '" + cliente.getNome() + "' foi removido da lista de e-mails.");
    }

    public void adicionarNovoProduto(String produto) {
        System.out.println("\n--- [" + this.nome + "] Novo produto em estoque: " + produto + ". Disparando e-mails...");
        


        for (Cliente cliente : this.clientes) {
            cliente.receberEmailDePromocao(this.nome, produto);
        }
    }
}
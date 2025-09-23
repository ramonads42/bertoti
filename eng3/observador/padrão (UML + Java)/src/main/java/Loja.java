import java.util.ArrayList;
import java.util.List;

public class Loja implements Publicador {
    private String nome;
    private List<Assinante> assinantes; 

    public Loja(String nome) {
        this.nome = nome;
        this.assinantes = new ArrayList<>(); 
    }

    @Override
    public void inscrever(Assinante assinante) {
        this.assinantes.add(assinante);
        Cliente cliente = (Cliente) assinante;
        System.out.println("[" + this.nome + "] O cliente '" + cliente.getNome() + "' adicionado com sucesso!");
    }

    @Override
    public void desinscrever(Assinante assinante) {
        this.assinantes.remove(assinante);
        Cliente cliente = (Cliente) assinante;
        System.out.println("[" + this.nome + "] Assinatura do cliente '" + cliente.getNome() + "' cancelada.");
    }

    @Override
    public void notificar(String produto) {
        System.out.println("\n--- [" + this.nome + "] Notificando " + this.assinantes.size() + " assinantes sobre o produto '" + produto + "'");
        for (Assinante assinante : this.assinantes) {
            assinante.update(this.nome, produto);
        }
    }

    //aciona a notificação
    public void adicionarNovoProduto(String produto) {
        notificar(produto);
    }
}

public class Cliente implements Assinante {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String nomeDaLoja, String produto) {
        System.out.println("  -> Olá, " + this.nome + "! A loja '" + nomeDaLoja + "' tem um novo produto: " + produto + "!");
    }

    public String getNome() {
        return nome;
    }
}
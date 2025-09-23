public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }


    public void receberEmailDePromocao(String nomeDaLoja, String produto) {
        System.out.println("  -> Olá, " + this.nome + "! E-mail especial da loja '" + nomeDaLoja + "': chegou um novo produto: " + produto + "!");
    }

    public String getNome() {
        return nome;
    }
}
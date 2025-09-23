public class Main {
    public static void main(String[] args) {

        Loja lojaDeRoupas = new Loja("VarejoJá");


        Cliente clienteMaria = new Cliente("Maria");
        Cliente clienteJoao = new Cliente("João");


        lojaDeRoupas.inscrever(clienteMaria);
        lojaDeRoupas.inscrever(clienteJoao);


        lojaDeRoupas.adicionarNovoProduto("Camiseta");


        lojaDeRoupas.desinscrever(clienteJoao);


        lojaDeRoupas.adicionarNovoProduto("Promoção de Calça Jeans");
    }
}
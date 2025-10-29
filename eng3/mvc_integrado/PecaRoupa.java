import java.util.ArrayList;
import java.util.List;

public class PecaRoupa implements Publicador {

    private String nome;
    private double precoBase;
    private int estoque;

    // Contexto Strategy: armazena a regra de preço atual
    private CalculadorPreco calculador; 

    // Lista de Views (Assinantes) para o Observer
    private List<Assinante> assinantes; 

    public PecaRoupa(String nome, double precoBase, int estoque) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
        this.assinantes = new ArrayList<>();
        // Define uma estratégia inicial para que o cálculo funcione
        this.setEstrategiaPreco(new PrecoNormal()); 
    }

    // --- Padrão Strategy: Troca de Regra ---

    public void setEstrategiaPreco(CalculadorPreco novaEstrategia) {
        this.calculador = novaEstrategia;
        System.out.println("LOG: Estratégia de preço alterada para: " + novaEstrategia.getClass().getSimpleName());
        // Recalcula e notifica a View
        notificar();
    }
    
    // --- Lógica de Negócio ---

    public double getPrecoFinal() {
        // Delega o cálculo para a estratégia atual
        return this.calculador.calcular(this.precoBase);
    }
    
    public void vender(int quantidade) {
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;
            System.out.println("LOG: Venda de " + quantidade + " unidades realizada.");
        } else {
            System.out.println("LOG: ESTOQUE INSUFICIENTE para a venda.");
        }
        // Notifica a View, seja por venda ou por erro de estoque.
        notificar();
    }
    
    // --- Padrão Observer: Publicador ---

    @Override
    public void inscrever(Assinante assinante) {
        this.assinantes.add(assinante);
        System.out.println("LOG: Novo display de estoque inscrito.");
    }

    @Override
    public void desinscrever(Assinante assinante) {
        this.assinantes.remove(assinante);
        System.out.println("LOG: Display desinscrito.");
    }

    @Override
    public void notificar() {
        double preco = getPrecoFinal();
        for (Assinante assinante : assinantes) {
            // Envia o preço e o estoque atualizado para a View
            assinante.update(preco, this.estoque);
        }
    }
}
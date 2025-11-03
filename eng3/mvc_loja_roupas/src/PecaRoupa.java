import java.util.ArrayList;
import java.util.List;

public class PecaRoupa implements Publicador {

    private String nome;
    private double precoBase;
    private int estoque;

    private CalculadorPreco calculador; 
    private List<Assinante> assinantes; 

    public PecaRoupa(String nome, double precoBase, int estoque) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
        this.assinantes = new ArrayList<>();
        // regra inicial
        this.setEstrategiaPreco(new PrecoNormal()); 
    }

    // Strategy
    public void setEstrategiaPreco(CalculadorPreco novaEstrategia) {
        this.calculador = novaEstrategia;
        // A notifica que a regra de preço mudou
        notificar(); 
    }
    
    public double getPrecoFinal() {
        return this.calculador.calcular(this.precoBase);
    }
    
    public void vender(int quantidade) {
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;

            System.out.println("LOG: Venda de " + quantidade + " unidades realizada.");
        } else {

            System.out.println("LOG: Erro! Tentativa de venda de " + quantidade + " unidades. Estoque insuficiente.");
        }
        notificar();
    }
    
    // Observer
    @Override
    public void inscrever(Assinante assinante) {
        this.assinantes.add(assinante);
    }

    @Override
    public void desinscrever(Assinante assinante) {
        this.assinantes.remove(assinante);
    }

    @Override
    public void notificar() {
        double preco = getPrecoFinal();
        for (Assinante assinante : assinantes) {
            // envia os dados contextuais para a View
            assinante.update(preco, this.estoque);
        }
    }
}
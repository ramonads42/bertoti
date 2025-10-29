public class LojaController implements LojaControllerInterface {

    private PecaRoupa model;
    private DisplayEstoque view; // Referência para inicializar a View
    
    public LojaController(PecaRoupa model) {
        this.model = model;
        
        // Inicializa a View e a inscreve no Model via construtor do View
        this.view = new DisplayEstoque(this.model);
        
        // O Model já notifica o estado inicial (PrecoNormal) ao View.
    }
    
    // --- Padrão Strategy: Troca de Regras ---
    
    @Override
    public void aplicarPromocaoNatal() {
        // Altera a Strategy no Model
        model.setEstrategiaPreco(new PromocaoNatal());
        System.out.println("CONTROLLER: Aplicando promoção de Natal.");
    }

    @Override
    public void removerPromocao() {
        // Altera a Strategy no Model
        model.setEstrategiaPreco(new PrecoNormal());
        System.out.println("CONTROLLER: Removendo promoção, voltando ao preço normal.");
    }

    // --- Padrão Observer: Mudança de Estado do Model ---

    @Override
    public void simularVenda(int quantidade) {
        // Altera o estado do Model (estoque). O Model notifica o View.
        model.vender(quantidade);
        System.out.println("CONTROLLER: Simulação de venda de " + quantidade + " unidades enviada ao Model.");
    }
}
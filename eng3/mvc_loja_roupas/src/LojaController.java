public class LojaController implements LojaControllerInterface {

    private PecaRoupa model;
    private DisplayEstoque view; 
    
    public LojaController(PecaRoupa model) {
        this.model = model;
        this.view = new DisplayEstoque(this.model);
    }
    
    // Strategy: Troca de Regras
    
    @Override
    public void aplicarPromocaoNatal() {
        System.out.println("CONTROLLER: Comando de 'Aplicar Promoção Natal' enviado ao Model.");
        // Muda a Strategy
        model.setEstrategiaPreco(new PromocaoNatal());
    }

    @Override
    public void removerPromocao() {
        System.out.println("CONTROLLER: Comando de 'Remover Promoção' enviado ao Model.");
        // Muda a Strategy
        model.setEstrategiaPreco(new PrecoNormal());
    }

    // Observer: Muda o Estado 

    @Override
    public void simularVenda(int quantidade) {
        System.out.println("CONTROLLER: Simulação de venda de " + quantidade + " unidades enviada ao Model.");
        model.vender(quantidade);
    }
}
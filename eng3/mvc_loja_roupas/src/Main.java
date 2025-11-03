public class Main {
    public static void main(String[] args) {
        
        PecaRoupa camiseta = new PecaRoupa("Camiseta Básica", 80.00, 25);
        
        LojaController controller = new LojaController(camiseta);
        
        System.out.println("\n*** SIMULAÇÃO DE INTERAÇÂO NA LOJA ***");
        
        // Simulação
        
        // Venda Simples
        controller.simularVenda(5); 
        
        controller.aplicarPromocaoNatal(); 
        
        controller.simularVenda(10); 
        
        controller.simularVenda(9); 
        
        controller.removerPromocao(); 
        
        System.out.println("\n--- FIM DE SIMULAÇÃO ---");
    }
}
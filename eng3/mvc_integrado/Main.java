public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Sistema MVC/Padrões: Loja de Roupas Iniciada ---");

        // 1. Cria o MODEL (PecaRoupa) com dados iniciais
        // Produto: Camiseta Básica | Preço Base: R$ 80.00 | Estoque: 25 unidades
        PecaRoupa camiseta = new PecaRoupa("Camiseta Básica", 80.00, 25);
        
        // 2. Cria o CONTROLLER. Ele inicializa o View (DisplayEstoque) e
        // conecta o Model ao View via Padrão Observer.
        LojaController controller = new LojaController(camiseta);
        
        System.out.println("\n*** SIMULAÇÃO DE INTERAÇÕES DA LOJA ***");
        
        // --- 1. Teste de Venda Simples (Preço Normal) ---
        // Estoque muda, e a View é notificada automaticamente (Padrão Observer)
        controller.simularVenda(5); 
        
        // --- 2. Aplicação de Promoção (Padrão Strategy) ---
        // A regra de cálculo muda, e a View é notificada
        controller.aplicarPromocaoNatal(); 
        
        // --- 3. Venda em Promoção (Strategy + Observer) ---
        // O preço final (agora com desconto) e o estoque mudam
        controller.simularVenda(10); 
        
        // --- 4. Venda de Estoque Baixo ---
        // Vende quase tudo para acionar o alerta (lógica do View)
        controller.simularVenda(9); 
        
        // --- 5. Remoção da Promoção (Strategy) ---
        // A regra volta ao normal, e a View é notificada com o novo preço mais caro
        controller.removerPromocao(); 
        
        System.out.println("\n--- FIM DA SIMULAÇÃO ---");
    }
}
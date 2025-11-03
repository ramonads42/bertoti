public class DisplayEstoque implements Assinante {
    
    public DisplayEstoque(Publicador model) {
        model.inscrever(this); 
        
        model.notificar(); 
    }
    
    @Override
    public void update(double precoFinal, int estoqueAtual) {
        System.out.println("\n--- NOTIFICAÇÃO DE ESTOQUE ---");
        System.out.printf("Preço Final: R$ %.2f%n", precoFinal);
        System.out.println("No Estoque: " + estoqueAtual + " unidades.");
        
        if (estoqueAtual <= 5 && estoqueAtual > 0) {
            System.out.println("ESTOQUE BAIXO");
        } else if (estoqueAtual == 0) {
            System.out.println("PRODUTO ESGOTADO");
        }
        System.out.println(" Dados atualizados!");
        System.out.println("-----------------------------");
    }
}
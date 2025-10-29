// Implementa o Assinante, que será notificado pelo Model
public class DisplayEstoque implements Assinante {
    
    // Construtor: a View se inscreve no Model
    public DisplayEstoque(Publicador model) {
        // O View se inscreve no Model, estabelecendo a conexão Observer
        model.inscrever(this); 
    }
    
    @Override
    public void update(double precoFinal, int estoqueAtual) {
        // O Model chamou este método e passou os dados atualizados
        System.out.println("\n--- NOTIFICAÇÃO DE ESTOQUE ---");
        System.out.println("Status: Dados atualizados!");
        System.out.printf("Preço Final (com estratégia): R$ %.2f%n", precoFinal);
        System.out.println("Estoque Atual: " + estoqueAtual + " unidades.");
        
        // Exemplo de lógica simples de View reagindo ao Model:
        if (estoqueAtual <= 5) {
            System.out.println("ATENÇÃO: ESTOQUE BAIXO!");
        } else if (estoqueAtual == 0) {
            System.out.println("PRODUTO ESGOTADO!");
        }
        System.out.println("-----------------------------");
    }
}
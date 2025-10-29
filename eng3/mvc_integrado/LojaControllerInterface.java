public interface LojaControllerInterface {

    /**
     * Aplica a estratégia de preço PromocaoNatal no Model.
     */
    void aplicarPromocaoNatal();

    /**
     * Volta para a estratégia de preço Normal no Model.
     */
    void removerPromocao();
    
    /**
     * Simula uma venda e notifica o Model para atualizar o estoque.
     * @param quantidade A quantidade vendida.
     */
    void simularVenda(int quantidade);
}
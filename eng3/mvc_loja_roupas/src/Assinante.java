// Contrato do objeto que recebe a notificação (a View)
public interface Assinante {
    void update(double precoFinal, int estoqueAtual);
}
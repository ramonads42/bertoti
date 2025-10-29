// Contrato para o objeto que publica o estado (o Model)
public interface Publicador {
    void inscrever(Assinante assinante);
    void desinscrever(Assinante assinante);
    void notificar();
}
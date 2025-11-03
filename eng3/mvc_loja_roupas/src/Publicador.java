// Contrato do o objeto que publica o o Model
public interface Publicador {
    void inscrever(Assinante assinante);
    void desinscrever(Assinante assinante);
    void notificar();
}
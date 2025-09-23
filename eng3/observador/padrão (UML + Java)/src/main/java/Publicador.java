// Define o contrato para todos os publicadores.
public interface Publicador {
    void inscrever(Assinante assinante);
    void desinscrever(Assinante assinante);
    void notificar(String produto);
}
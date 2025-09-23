public class Pousada {
    private Preco estrategia;

    public void setEstrategia(Preco estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValorDaDiaria(double valorBase) {
        return estrategia.calcular(valorBase);
    }
}
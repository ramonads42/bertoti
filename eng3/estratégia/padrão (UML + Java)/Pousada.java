public class Pousada {
    private EstrategiaDePreco estrategia;

    public void setEstrategia(EstrategiaDePreco estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValorDaDiaria(double valorBase) {
        return estrategia.calcular(valorBase);
    }
}
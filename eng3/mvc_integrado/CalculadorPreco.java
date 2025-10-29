// Contrato para todas as formas de calcular o preço final
@FunctionalInterface
public interface CalculadorPreco {
    double calcular(double precoBase);
}
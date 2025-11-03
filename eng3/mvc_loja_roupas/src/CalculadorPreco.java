// Contrato para calcular o preço final
@FunctionalInterface
public interface CalculadorPreco {
    double calcular(double precoBase);
}
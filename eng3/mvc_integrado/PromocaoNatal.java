public class PromocaoNatal implements CalculadorPreco {
    @Override
    public double calcular(double precoBase) {
        System.out.println("LOG: Aplicando 15% de desconto de Natal.");
        return precoBase * 0.85; // 100% - 15% = 85%
    }
}
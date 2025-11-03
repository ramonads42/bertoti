public class PromocaoNatal implements CalculadorPreco {
    @Override
    public double calcular(double precoBase) {
        System.out.println("Aplicado 15% de desconto no Natal.");
        return precoBase * 0.85; 
    }
}
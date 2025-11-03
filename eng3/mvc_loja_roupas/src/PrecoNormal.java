public class PrecoNormal implements CalculadorPreco {
    @Override
    public double calcular(double precoBase) {
        System.out.println("LOG: Estratégia de preço alterada para: PrecoNormal");
        return precoBase;
    }
}
public class Main {
    public static void main(String[] args) {
        Pousada pousada = new Pousada();
        double valorBase = 100.0;

        //Temporada Normal
        pousada.setEstrategia(vb -> vb);
        double valorFinal1 = pousada.calcularValorDaDiaria(valorBase);
        System.out.println("Valor final da diária (Normal): R$" + valorFinal1);

        System.out.println("---");

        //Alta Temporada
        pousada.setEstrategia(vb -> vb * 1.5);
        double valorFinal2 = pousada.calcularValorDaDiaria(valorBase);
        System.out.println("Valor final da diária (Alta): R$" + valorFinal2);
        
        System.out.println("---");

        //Feriado
        pousada.setEstrategia(vb -> vb * 2.0);
        double valorFinal3 = pousada.calcularValorDaDiaria(valorBase);
        System.out.println("Valor final da diária (Feriado): R$" + valorFinal3);
    }
}
public class Main {
    public static void main(String[] args) {
        Pousada pousada = new Pousada();
        double valorBase = 100.0;
        
        //dia comum
        pousada.setTemporada("NORMAL");
        double valorFinal1 = pousada.calcularValorDaDiaria(valorBase);
        System.out.println("Valor final da diária (Normal): R$" + valorFinal1);

        System.out.println("---");
        
        //Férias
        pousada.setTemporada("ALTA");
        double valorFinal2 = pousada.calcularValorDaDiaria(valorBase);
        System.out.println("Valor final da diária (Alta): R$" + valorFinal2);
    }
}
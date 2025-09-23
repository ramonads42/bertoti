public class Pousada {
    private String tipoTemporada; 

    public void setTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public double calcularValorDaDiaria(double valorBase) {
        if ("ALTA".equals(tipoTemporada)) {
            System.out.println("Cálculo para Alta Temporada (acréscimo de 50%)");
            return valorBase * 1.5;
        } else if ("FERIADO".equals(tipoTemporada)) {
            System.out.println("Cálculo para Feriado (acréscimo de 100%)");
            return valorBase * 2.0;
        } else { 
            System.out.println("Cálculo para Temporada Normal");
            return valorBase;
        }
    }
}
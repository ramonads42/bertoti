classDiagram
    direction LR
    
    class Preco {
        <<Interface>>
        +calcular(double valorBase) double
    }

    class Pousada {
        -Preco estrategia
        +setEstrategia(Preco) void
        +calcularValorDaDiaria(double) double
    }
    
    class PrecoNormal {
        +calcular(double valorBase) double
    }

    class PrecoAltaTemporada {
        +calcular(double valorBase) double
    }
    
    class PrecoFeriado {
        +calcular(double valorBase) double
    }

    Preco <|.. PrecoNormal : implementa
    Preco <|.. PrecoAltaTemporada : implementa
    Preco <|.. PrecoFeriado : implementa
    Pousada o--> Preco : "usa Strategy"

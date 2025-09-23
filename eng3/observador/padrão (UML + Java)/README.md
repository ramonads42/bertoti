Esta implementação do padrão Observer foi desenvolvida como um exercício prático para aplicar os conceitos estudados na disciplina de Engenharia de Software.


classDiagram
 

    class Publicador {
        <<Interface>>
        +inscrever(Assinante) void
        +desinscrever(Assinante) void
        +notificar() void
    }

    class Assinante {
        <<Interface>>
        +update(String produto) void
    }

    class Loja {
        -String nome
        -List~Assinante~ assinantes
        -String ultimoProduto
        +inscrever(Assinante) void
        +desinscrever(Assinante) void
        +notificar() void
        +adicionarNovoProduto(String) void
    }

    class Cliente {
        -String nome
        +update(String produto) void
    }

    Publicador <|.. Loja : implementa
    Assinante <|.. Cliente : implementa
    Loja o--> Assinante : "tem uma lista de"
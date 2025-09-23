Esta implementação do antipadrão do comportamento Observer foi desenvolvida como um exercício prático para aplicar os conceitos estudados na disciplina de Engenharia de Software 3.


classDiagram

    class Loja {
        -String nome
        -List~Cliente~ clientes
        +inscrever(cliente: Cliente) void
        +desinscrever(cliente: Cliente) void
        +adicionarNovoProduto(produto: String) void
    }

    class Cliente {
        -String nome
        +receberEmailDePromocao(nomeDaLoja: String, produto: String) void
    }

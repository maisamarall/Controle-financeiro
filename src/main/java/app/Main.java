package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ControleGastos controle = new ControleGastos();
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println(" \uD83D\uDCB0 Controle Gastos  ");
            System.out.println("==============================");
            System.out.println(" 1\uFE0F⃣- Adicionar Registro");
            System.out.println(" 2\uFE0F⃣- Adicionar ganho");
            System.out.println(" 3\uFE0F⃣- Listar Registro");
            System.out.println(" 4\uFE0F⃣- Mostrar saldo");
            System.out.println(" 0\uFE0F⃣- Sair");

            System.out.print("\"\uD83D\uDC49 Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Você escolheu a opção: " + opcao);

            if (opcao == 1) {
                System.out.println("Digite a descrição do gasto: ");
                String descricao = scanner.nextLine();

                System.out.println("Digite o valor do gasto: ");
                double valor = scanner.nextDouble();

                controle.adicionarGasto(descricao, valor);
                System.out.println("Gasto adicionado com sucesso! ✅ ");
            }

            if(opcao == 2) {
                System.out.println("Digite a descricao do ganho: ");
                String descricao = scanner.nextLine();

                System.out.println("Digite o valor do ganho: ");
                double valor = scanner.nextDouble();

                controle.adicionarGanho(descricao, valor);
                System.out.print("Ganho adicionado com sucesso! ✅");
            }

            if (opcao == 3) {
                controle.listarRegistros();
            }

            if (opcao == 4) {
                controle.mostrarSaldo();
            }

        }  while (opcao != 0);

        System.out.println("Programa encerrado. \uD83D\uDC4B ");
        scanner.close();
    }
}

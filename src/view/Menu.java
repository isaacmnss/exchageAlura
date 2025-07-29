package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void exibirMenu(){
        Scanner scanner = new Scanner(System.in);
        Integer opcao = -1;
        String menu ="""
                Seja bem vindo ao conversor de moeda
                
                1 - Dólar -> Peso Argentino
                2 - Peso Argentino -> Dólar
                3 - Dólar -> Real
                4 - Real -> Dólar
                5 - Dólar -> Peso colombiano
                6 - Peso colombiano - Dólar
                
                
                
                0 - Sair
                """;
        while (opcao != 0){
            System.out.println(menu);
            boolean inputValido = false;

            while (!inputValido) {
                try {
                    opcao = scanner.nextInt();
                    inputValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida, tente novamente");
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    //case 1
                    break;
                case 2:
                    //case 2
                    break;
                case 3:
                    //case 3
                    break;
                case 4:
                    //case 4
                    break;
                case 5:
                    //case 5
                    break;
                case 6:
                    //case 6
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
        System.out.println(menu);
        scanner.nextLine();
    }
}

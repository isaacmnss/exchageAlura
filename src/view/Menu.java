package view;

import service.ConversaoService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void exibirMenu(){
        ConversaoService conversaoService = new ConversaoService();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        String menu ="""
                Seja bem vindo ao conversor de moeda
                
                1 - Dólar -> Peso Argentino
                2 - Peso Argentino -> Dólar
                3 - Dólar -> Real
                4 - Real -> Dólar
                5 - Dólar -> Peso colombiano
                6 - Peso colombiano -> Dólar
                
                
                
                0 - Sair
                """;
        while (opcao != 0) {
            System.out.println(menu);
            boolean inputValido = false;

            while (!inputValido) {
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    inputValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida, tente novamente");
                    scanner.nextLine();
                }
            }

            switch (opcao) {
                case 1:
                    conversaoService.ConverterMoeda("USD", "ARS");
                    break;
                case 2:
                    conversaoService.ConverterMoeda("ARS","USD");
                    break;
                case 3:
                    conversaoService.ConverterMoeda("USD", "BRL");
                    break;
                case 4:
                    conversaoService.ConverterMoeda("BRL", "USD");
                    break;
                case 5:
                    conversaoService.ConverterMoeda("USD", "COP");
                    break;
                case 6:
                    conversaoService.ConverterMoeda("COP", "USD");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}

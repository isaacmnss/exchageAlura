package view;

import java.util.Scanner;

public class Menu {
    public void exibirMenu(){
        Scanner scanner = new Scanner(System.in);
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
        System.out.println(menu);
        Integer opcao = scanner.nextInt();


    }
}

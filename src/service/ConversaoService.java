package service;

import java.util.Scanner;

public class ConversaoService {
    private final String endereco = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/";

    public void ConverterMoeda(String moedaOriginal, String moedaConvertida){
        ConsumoAPI consumoAPI = new ConsumoAPI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em "+moedaOriginal+" que deseja converter: ");
        consumoAPI.obterDados()
    }
}

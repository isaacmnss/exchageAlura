package service;

import com.google.gson.*;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.Scanner;

public class ConversaoService {
    Dotenv dotenv = Dotenv.load();
    final String API_KEY = dotenv.get("API_KEY");
    private final String enderecoBase = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/pair/";

    public void ConverterMoeda(String moedaOriginal, String moedaConvertida){
        ConsumoAPI consumoAPI = new ConsumoAPI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em "+moedaOriginal+" que deseja converter: ");
        double quantidadeMoeda = scanner.nextDouble();
        String endereco =  enderecoBase+moedaOriginal+"/"+moedaConvertida+"/"+quantidadeMoeda+"/";
        System.out.println(endereco);
        String json = consumoAPI.obterDados(endereco);
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        double valorFinal = jsonObject.get("conversion_result").getAsDouble();

        System.out.println("O valor "+quantidadeMoeda+" "+moedaOriginal+" corresponde ao valor final de "+valorFinal+" "
                +moedaConvertida);
    }
}

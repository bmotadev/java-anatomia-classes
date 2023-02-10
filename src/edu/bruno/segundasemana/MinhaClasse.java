package edu.bruno.segundasemana;
public class MinhaClasse {
    public static void main(String [] args) {
        // String meuNome = "Bruno";

        // int anoFabricacao = 1700;

        // boolean verdadeira = true; // true or false

        // anoFabricacao = 2018;

        String primeiroNome = "Bruno";
        String segundoNome = "Mota";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

package estrutura.sequencia;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("digite seu nome");
        nome = entrada.nextLine();

       System.out.println("muito prazer " + nome);

    }
}

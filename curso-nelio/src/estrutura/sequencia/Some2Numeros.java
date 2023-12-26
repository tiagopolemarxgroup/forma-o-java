package estrutura.sequencia;

import java.util.Scanner;

public class Some2Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        double media;
        System.out.println("Informe um numero: ");
        n1 = entrada.nextInt();

        System.out.println("Informe um numero: ");
        n2 = entrada.nextInt();

        media = (n1 + n2) /2;

        System.out.println("A soma é :" + media);

        int a = Math.abs(50);
        System.out.println(a);
    }
}

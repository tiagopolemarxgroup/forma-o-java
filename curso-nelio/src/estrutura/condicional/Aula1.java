package estrutura.condicional;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que horas?");
        int hora = entrada.nextInt();
        if(hora < 12){
            System.out.println("Bom dia");
        }else if(hora >= 12 && hora < 18){
            System.out.println("boa tarde");
        }else if(hora >= 18 && hora <= 24){
            System.out.println("boa noite");
        }else {
            System.out.println("hora inválida");
        }

    }
}

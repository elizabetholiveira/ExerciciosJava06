import java.util.Scanner;

public class Multiplo5E7 {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Me diga um número inteiro e eu direi se ele é múltiplo de 5 e 7 ao mesmo tempo!");
        int numero = resp.nextInt();

        if ((numero %5 == 0) && (numero %7 ==0)){
            System.out.println("Sim! Esse número é múltiplo de 5 e 7 ao mesmo tempo!");
        } else {
            System.out.println("Sinto muito, mas esse número não é múltiplo de 5 e 7 ao mesmo tempo.");
        }

        System.out.println("Tenha um bom dia!");
    }
}

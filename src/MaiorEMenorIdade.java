import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorEMenorIdade {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Me diga 10 idades e eu direi qual a maior e qual a menor!");

        List<Integer> idade = new ArrayList<>(){};

        for (int i = 0; i < 10; i++){
            System.out.println("Diga a " + (i +1) + "ª idade:");
            idade.add(resp.nextInt());
        }

        int menornumero = Integer.MAX_VALUE;
        int maiornumero = Integer.MIN_VALUE;

        for (int n : idade) {
            int numero = n;
            if (numero < menornumero) {
                menornumero = numero;
            }
            if (numero > maiornumero) {
                maiornumero = numero;
            }
        }

        System.out.println("Você digitou as idades:");

        for (int n = 0; n < 10; n++){
            System.out.println(idade.get(n));
        }

        System.out.println("");

        System.out.println("A menor idade é: " + menornumero);
        System.out.println("Ela está na posição " + idade.indexOf(menornumero) + " do vetor, ou seja, foi a " + (idade.indexOf(menornumero) + 1) + "ª idade escrita!");

        System.out.println("");

        System.out.println("A maior idade é: " + maiornumero);
        System.out.println("Ela está na posição " + idade.indexOf(maiornumero) + " do vetor, ou seja, foi a " + (idade.indexOf(maiornumero) + 1) + "ª idade escrita!");

        System.out.println("");

        System.out.println("Tenha um bom dia!");
    }
}

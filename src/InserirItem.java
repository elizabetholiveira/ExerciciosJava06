import java.util.Scanner;

public class InserirItem {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros [0] = 52;
        numeros [1] = 34;
        numeros [3] = 99;

        System.out.println("A professora pediu para João escrever quatro números aleatórios, João escreveu:");

        for (int i = 0; i < numeros.length; i++){
            System.out.println((i + 1) + "º número: " + numeros[i]);
        }

        System.out.println("Infelizmente João não teve criatividade para o terceiro número! Por favor, ajude o João!");

        Scanner resp = new Scanner(System.in);

        System.out.println("Qual número você diz para João escrever?");
        numeros [2] = resp.nextInt();

        System.out.println("Muito obrigado!");
        System.out.println("Graças à sua ajuda a lista de João ficou assim:");

        for (int i = 0; i < numeros.length; i++){
            System.out.println((i + 1) + "º número: " + numeros[i]);
        }
    }
}

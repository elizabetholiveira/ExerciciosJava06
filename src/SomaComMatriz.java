import java.util.Scanner;

public class SomaComMatriz {

    public static void main(String[] args) {

        Integer[][] numeros = new Integer[2][10];

        Scanner resp = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int n = 0; n < numeros[i].length; n++){
                int posicao = i * 10 + n + 1;
                System.out.println("Digite o " + posicao + "º número:");
                numeros[i][n] = resp.nextInt();
                soma = soma + numeros[i][n];
            }
        }

        System.out.println("Soma: " + soma);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetoresABC {
    public static void main(String[] args) {
        // Ler Vetor A com 20 elementos
        // Armazenar os pares no B
        // Armazenar os ímpares no C

        Scanner resp = new Scanner(System.in);

        System.out.println("Olá! Me diga 20 números inteiros, por favor!");

        List<Integer> A = new ArrayList<>();

        for (int i = 0; i < 20 ; i++){
            System.out.println("Qual o " + (i + 1) + "º número?");
            A.add(resp.nextInt());
        }

        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        System.out.println("Os números que você digitou são: ");
        for (int i = 0; i < 20; i++){
            System.out.println(A.get(i));
            if (A.get(i) %2 == 0){
                B.add(A.get(i));
            } if (A.get(i) %2 != 0){
                C.add(A.get(i));
            }
        }

        System.out.println("Dentre esses, os números pares são:");
        for (int i = 0; i < B.size(); i++){
            System.out.println(B.get(i));
        }

        System.out.println("E os números ímpares são:");
        for (int i = 0; i < C.size(); i++){
            System.out.println(C.get(i));
        }

        System.out.println("Tenha um bom dia!");
    }
}


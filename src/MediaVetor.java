import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaVetor {

    public static void main(String[] args) {

        System.out.println("Olá! Aqui você vai me dizer 10 números, eu vou identificar quais são ímpares e fazer a média aritmética");

        Scanner resp = new Scanner(System.in);

        double soma = 0;

        List<Integer> A = new ArrayList<>(){};

        for (int i = 0; i < 10; i++){
            System.out.println("Qual o " + (i +1) + "º número?");
            A.add(resp.nextInt());
           if (A.get(i) %2 != 0){
               soma = soma + A.get(i);
           }
        }

        double media = soma / 10;

        System.out.println("Os números ímpares são");

        for (int i = 0; i < 10; i++){
            if (A.get(i) %2 != 0){
                System.out.println(A.get(i));
            }
        }

        System.out.println("A média dos números ímpares é: " + media);
    }
}

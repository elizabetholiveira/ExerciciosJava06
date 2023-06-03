import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaSalario {

    public static void main(String[] args) {

        // Quantos funcionários tem na empresa?
        // Quais os salários?
        // Qual a média salarial?

        Scanner resp = new Scanner(System.in);

        List<Double> salarios = new ArrayList<>();

        System.out.println("Olá! Quantos funcionários existem na sua empresa?");
        int funcionarios = resp.nextInt();

        System.out.println("Então a sua empresa tem " + funcionarios + " funcionários!");

        System.out.println("Agora me diga...");

        for (int i = 0; i < funcionarios; i++){
            System.out.println("Qual o salário do " + (i + 1) + "º funcionário?");
            salarios.add(resp.nextDouble());
        }

        for (int i = 0; i < funcionarios; i++){
            System.out.printf("O salário do " + (i +1) + "º funcionário é: R$%,.2f%n", salarios.get(i));
        }

        double somasalarios = 0;
        double mediasalarios = 0;

        for (int i = 0; i < funcionarios; i++){
            somasalarios = somasalarios + salarios.get(i);
            mediasalarios = somasalarios / funcionarios;
        }

        System.out.printf("A soma dos salários de todos os seus funcionários é: R$%,.2f%n", somasalarios);
        System.out.printf("A média do salário dos seus funcionários é: R$%,.2f%n", mediasalarios);
    }
}

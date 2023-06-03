import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Por favor, digite dois números inteiros diferentes e eu direi a ordem decrescente deles!");

        System.out.println("Qual o primeiro número?");
        int numero1 = resp.nextInt();

        System.out.println("Qual o segundo número?");
        int numero2 = resp.nextInt();

        if (numero1 > numero2){
            System.out.println("Pois não! A ordem decrescente é:");
            while (numero1 >= numero2){
                System.out.println(numero1);
                numero1--;
            }
            System.out.println("Tenha um bom dia!");
        } else if (numero2 > numero1) {
            System.out.println("Pois não! A ordem decrescente é:");
            while (numero2 >= numero1){
                System.out.println(numero2);
                numero2--;
            }
            System.out.println("Tenha um bom dia!");
        } else {
            System.out.println("Os números são iguais! :(");
        }
    }
}

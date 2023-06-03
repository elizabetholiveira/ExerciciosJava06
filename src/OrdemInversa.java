import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {

        System.out.println("Olá! Me diga quantos números você quer e a ordem deles e eu te direi como eles ficam na ordem inversa!");

        Scanner resp = new Scanner(System.in);

        System.out.println("Quantos números você quer?");
        int quantNumeros = resp.nextInt();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < quantNumeros; i++){
            System.out.println("Qual é o " + (i + 1) + "º número?");
            numeros.add(resp.nextInt());
        }

        System.out.println("Os seus números são:");

        Iterator<Integer> iterator = numeros.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Os seus números ao contrário são:");

        for (int i = (quantNumeros - 1); i >= 0; i--){
            System.out.println(numeros.get(i));
        }
        }
}

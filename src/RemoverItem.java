import java.util.*;

public class RemoverItem {
    public static void main(String[] args) {

        System.out.println("Nós tínhamos quatro pessoas:");

        List<String> nomes = new ArrayList<String>() {
        };

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("José");
        nomes.add("Benjamin");

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Scanner resp = new Scanner(System.in);

        System.out.println("Mas temos que remover alguém... Quem a gente remove?");
        String quem = resp.nextLine();

        nomes.remove(quem);

        System.out.println("Então agora temos:");

        Iterator<String> iterator1 = nomes.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}

public class Entre100e150 {

    public static void main(String[] args) {

        System.out.println("Esse são todos os números entre 100 e 150 que a soma de seus dígitos é um número par:");

        for (int i = 100; i < 150; i++){
            int centenas = i / 100;
            int dezenas = (i%100) / 10;
            int unidades = (i%100)%10;
            if (((centenas + dezenas + unidades) %2) == 0 ) {
                System.out.println(i);
            }
        }
    }
}

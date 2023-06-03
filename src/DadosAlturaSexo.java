import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DadosAlturaSexo {

    public static void main(String[] args) {

        // conjunto de dados de 10 pessoas:
        // - altura
        // - sexo (maculino/feminino)
        // a.1) Qual a maior altura?
        // a.2) Qual a menor altura?
        // b) Média da altura dos homens (sexo masculino)
        // c) Número de mulheres (sexo feminino)

        //double[][] pessoas = new double[2][10];

        Map<Integer,Double> dados = new LinkedHashMap<>();

        Scanner resp = new Scanner(System.in);

        System.out.println("Olá, me informe o sexo e a altura de 10 pessoas!");

        int i = 1;
        double altura = 0;

        while (i <= 10){
            System.out.println("Essa é a " + i + "ª pessoa!");
            System.out.println("Qual o sexo da pessoa?");
            System.out.println("(Selecione 1 para masculino e 2 para feminino)");
            int sexo = resp.nextInt();
            switch (sexo){
                case 1:
                    System.out.println("Qual é a altura dele?");
                    altura = resp.nextDouble();
                    dados.put((9 + i), altura);
                    break;
                case 2:
                    System.out.println("Qual é a altura dela?");
                    altura = resp.nextDouble();
                    dados.put((19 + i), altura);
                    break;
                default:
                    System.out.println("Número inválido!");
                    i = 10;
                    break;
            }
            i++;
        }

        double menornumero = Integer.MAX_VALUE;
        double maiornumero = Integer.MIN_VALUE;

        double soma = 0;
        int numeromasculino = 0;
        int numerofeminino = 0;

        for (int n : dados.keySet()){
            //System.out.println(dados.get(n));
            double numero = dados.get(n);
            if (numero < menornumero) {
                menornumero = numero;
            }if (numero > maiornumero) {
                maiornumero = numero;
            }

            if ((n >= 10) && (n < 20)){
                soma = soma + dados.get(n);
                numeromasculino++;
            }
            if (n >= 20){
                numerofeminino++;
            }
        }

        //System.out.println("soma:" + soma);
        double media = soma / numeromasculino;

        System.out.println("");

        System.out.println("A menor altura é: " + menornumero);
        System.out.println("A maior altura é: " + maiornumero);

        System.out.println("A média da altura dos indivíduos do sexo masculino é: " + media);

        System.out.println("O total de indivíduos do sexo feminino é: " + numerofeminino);

        System.out.println("");

        System.out.println("Tenha um bom dia!");

    }
}

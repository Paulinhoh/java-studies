import java.util.ArrayList;

public class Main {
    static void main() {

        //  =-=-=-=-=--=-= variaveis =-=-=-=-=--=-=
        int minhaIdade = 20;
        String meuNome = "Paulo H";
        var outroNome = "Paulinho";


        //  =-=-=-=-=--=-= tipos primitivos =-=-=-=-=--=-=
        //  numeros inteiros
        /*
         * byte -> 8 bits
         * short -> 16 bits
         * int -> 32 bits
         * log -> 64 bits
         * */

        //  numeros decimais
        /*
         * float -> 32 bits -> precisão simples
         * double -> 64 bits -> precisao dupla
         * */

        //  caracteres
        /*
         * String " " -> representa palavras ou frases
         * char ' ' -> representa um unico caractere
         * */

        //  booleans
        /*
         * true or false
         * */

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'a';
        String str = "Paulinho";
        boolean bool = true;


        //  =-=-=-=-=--=-= condicionais =-=-=-=-=--=-=
        if (str.isBlank()) {
            System.out.println("verdadeiro");
        } else if (str.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("falso");
        }


        //  =-=-=-=-=--=-= vetores =-=-=-=-=--=-=
        // vetor de tamanho fixo
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};
        //                         0  1  2  3  4
        int[] meusNumeros = new int[5];

        System.out.println(colecaoDeInteiros.length); // tamanho do array
        System.out.println(colecaoDeInteiros[4]); // sout: 5
        System.out.println();


        //  =-=-=-=-=--=-= arraylist =-=-=-=-=--=-=
        // array dinamico
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Paulinho");
        nomes.add("Gabriel");
        nomes.add("Ana");
        nomes.add("Maria");

        System.out.println(nomes.get(2)); // sout: Ana

        nomes.remove(3);
        nomes.remove("Gabriel");
        System.out.println();


        //  =-=-=-=-=--=-= loops =-=-=-=-=--=-=
        // for
        for (int j = 0; j < nomes.size(); j++) {
            System.out.println(nomes.get(j));
        }
        System.out.println();

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println();

        // while
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        System.out.println();


        //  =-=-=-=-=--=-= casting =-=-=-=-=--=-=
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 0;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);


        //  =-=-=-=-=--=-= classes =-=-=-=-=--=-=
        Carro carro1 = new Carro("Ferrari");
        Carro carro2 = new Carro("BMW");

        carro1.acelerar();
        carro2.acelerar();


        //  =-=-=-=-=--=-= interface =-=-=-=-=--=-=
        CarroInterface carro3 = new BMW();
        carro3.acelerar();
        carro3.freiar();


        //  =-=-=-=-=--=-= classe abstrata, herança e polimorfismo =-=-=-=-=--=-=
        SerVivo humano = new Humano(25);
        humano.dormir();


        //  =-=-=-=-=--=-= tratamento de exceções =-=-=-=-=--=-=
        Carro meuCarroFurado = null;
        try {
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("vende carro furado");
        }
    }
}
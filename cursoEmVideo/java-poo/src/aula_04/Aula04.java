package aula_04;

public class Aula04 {
    public static void main(String[] args) {

        Caneta04 c1 = new Caneta04("BIC", 0.5f, "Azul");
        c1.status();
        System.out.println();

        Caneta04 c2 = new Caneta04("BIC", 0.5f, "Vermelha");
        c2.status();
    }
}

package aula_02;

public class Aula02 {
    public static void main(String[] args) {
        aula_02.Caneta02 c1 = new aula_02.Caneta02();
        c1.cor = "Azul";
        c1.ponta = 0.5f;

        c1.tampar();
        c1.rabiscar();

        c1.status();

        c1.destampar();
        c1.rabiscar();
    }
}

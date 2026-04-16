package aula_03;

public class Aula03 {
    public static void main(String[] args) {

        Caneta03 c1 = new Caneta03();
        c1.modelo = "BIC Crystal";
        c1.cor = "Azul";

        c1.carga = 80;

        c1.tampar();
        c1.status();
    }
}

/*
 *   Visibility
 *   + (public)
 *   - (private)
 *   # (protect)
 */

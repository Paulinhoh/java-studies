package aula_02;

public class Caneta02 {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("A caneta esta tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}

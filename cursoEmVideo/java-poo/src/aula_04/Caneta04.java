package aula_04;

public class Caneta04 {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //    Construtor
    public Caneta04(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = true;
    }

    //    Getters
    public String getModelo() {
        return this.modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public String getCor() {
        return this.cor;
    }

    //    Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //    Metodos
    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}

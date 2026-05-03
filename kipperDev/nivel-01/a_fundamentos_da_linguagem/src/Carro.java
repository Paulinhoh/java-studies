public class Carro {
    private String modelo;

    public Carro(String modelo) {
        System.out.println("carro criado");
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println(this.modelo + ": acelerando...");
    }
}

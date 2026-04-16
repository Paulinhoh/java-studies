package aula_12;

public class Peixe extends Animal {
    private String corEscamas;

    @Override
    public void locomove() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolhas() {
        System.out.println("Soltando bolhas...");
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}

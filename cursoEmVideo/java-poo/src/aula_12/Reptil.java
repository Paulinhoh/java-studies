package aula_12;

public class Reptil extends Animal {
    private String corEscamas;

    @Override
    public void locomove() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil...");
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}

package aula_12;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomove() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som Mamífero...");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

package aula_12;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomove() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave...");
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

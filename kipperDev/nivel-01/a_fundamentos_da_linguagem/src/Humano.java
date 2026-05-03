public class Humano extends SerVivo{
    public Humano(int idade) {
        super(idade);
    }

    @Override
    public void respirar() {
        System.out.println("Humano respirando...");
    }

    @Override
    public void dormir() {
        System.out.println("Humano dormindo...");
    }
}

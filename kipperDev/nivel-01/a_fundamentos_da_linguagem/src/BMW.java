public class BMW implements CarroInterface {
    @Override
    public void acelerar() {
        System.out.println("BMW acelerando...");
    }

    @Override
    public void freiar() {
        System.out.println("BMW freiando...");
    }

    @Override
    public void parar() {
        System.out.println("BMW parando...");
    }
}

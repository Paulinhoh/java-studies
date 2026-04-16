package aula_05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco cb = new ContaBanco("Paulo Henrique", 176235);

        System.out.println(cb.getStatus());
        cb.abrirConta("CC");
        System.out.println();

        System.out.println(cb.getStatus());
        cb.depositar(150);
        System.out.println(cb.getSaldo());
        System.out.println();

        cb.pagarMensal();
        System.out.println(cb.getSaldo());
        System.out.println();

        cb.sacar(200);
        cb.sacar(100.50);
        System.out.println(cb.getSaldo());
        System.out.println();

        cb.estadoAtual();
        System.out.println();

        cb.abrirConta("CC");
        cb.fecharConta();
        System.out.println();

        cb.sacar(87.5);
        System.out.println(cb.getSaldo());
        cb.fecharConta();
        System.out.println();

        cb.estadoAtual();
        cb.sacar(15);
    }
}

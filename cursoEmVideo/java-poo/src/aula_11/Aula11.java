package aula_11;

public class Aula11 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); -> classe abstrata não pode ser instanciada
        Visitante v1 = new Visitante();
        System.out.println(v1.toString());
        System.out.println();

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        System.out.println();

        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setIdade(22);
        b1.setSexo("F");
        b1.setMatricula(2222);
        b1.setCurso("Medicina");
        System.out.println(b1.toString());
        b1.renovarBolsa();
        b1.pagarMensalidade();
    }
}

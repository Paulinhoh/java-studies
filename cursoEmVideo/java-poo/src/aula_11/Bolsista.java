package aula_11;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa...");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista, pagamento facilitado.");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}

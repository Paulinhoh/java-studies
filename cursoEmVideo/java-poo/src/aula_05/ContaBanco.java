package aula_05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private final String dono;
    private double saldo;
    private boolean status;


    //    Construtor
    public ContaBanco(String dono, int numConta) {
        this.saldo = 0;
        this.status = false;
        this.dono = dono;
        this.numConta = numConta;
    }


    //    Métodos
    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta Atual: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------");
    }

    public void abrirConta(String tipo) {
        if (this.status) {
            System.out.println("Esta conta ja esta aberta.");
            return;
        }

        this.status = true;
        this.tipo = tipo;

        if (this.tipo == "CC") {
            this.saldo = 50;
        } else if (this.tipo == "CP") {
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (!this.status) {
            System.out.println("Conta Fechada ja esta fechada.");
            return;
        }
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta Fechada com sucesso!");
            return;
        }
        System.out.println("""
                Não foi possivel fechar a conta!
                Verifique as seguintes situações:
                - Se ainda a dinheiro na conta (se houver não tem como fechar a conta);
                - Se a multas a serem pagas (se houver não tem como fechar a conta);""");
    }

    public void depositar(double valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            return;
        }
        System.out.println("Não foi possivel fazer o deposito! Verifique se a conta esta aberta.");
    }

    public void sacar(double valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                return;
            }
            System.out.println("Não foi possivel realizar o saque! Saldo insuficiente!.");
            return;
        }
        System.out.println("Não foi possivel realizar o saque! Verifique se a conta esta aberta.");
    }

    public void pagarMensal() {
        if (this.status) {
            if (this.tipo == "CC") {
                this.saldo -= 12;
            } else if (this.tipo == "CP") {
                this.saldo -= 20;
            }
        }
    }


    //    Getters and Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }


    public double getSaldo() {
        return saldo;
    }


    public boolean getStatus() {
        return status;
    }
}

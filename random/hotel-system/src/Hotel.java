import java.util.ArrayList;

public class Hotel {
    ArrayList<Quarto> quartos = new ArrayList<>();

    public void adicionarQuarto(Quarto q) {
        quartos.add(q);
    }

    public void listarQuartos() {
        System.out.println("==========================");
        System.out.println("     Lista de Quartos     ");
        System.out.println("==========================");

        for (Quarto q : quartos) {
            System.out.println("Número: " + q.getNumero());
            System.out.println("Tipo: " + q.getTipo());

            if (q.getDisponibilidade()) {
                System.out.println("Disponibilidade: Disponivel");
            } else {
                System.out.println("Disponibilidade: Indisponivel");
            }
            System.out.println();
        }
    }

    public void reservarQuarto(int numeroQuarto) {

        for (Quarto q : quartos) {
            if (q.getNumero() == numeroQuarto) {
                if (q.getDisponibilidade()) {
                    q.setDisponibilidade(false);
                    System.out.println("Quarto reservado");
                } else {
                    System.out.println("Quarto Indisponivel");
                }
                return;
            }
        }
        System.out.println("Quarto não encontrado");
    }

    public void cancelarReserva(int numeroQuarto) {

        for (Quarto q : quartos) {
            if (q.getNumero() == numeroQuarto) {
                if (q.getDisponibilidade()) {
                    System.out.println("Quarto não estava reservado");
                } else {
                    q.setDisponibilidade(true);
                    System.out.println("Reserva cancelada");
                }
                return;
            }
        }
        System.out.println("Quarto não encontrado");
    }
}

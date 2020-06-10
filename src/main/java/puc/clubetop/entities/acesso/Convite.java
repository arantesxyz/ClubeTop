package puc.clubetop.entities.acesso;

import java.time.LocalDate;

public class Convite implements CartaoDeAcesso {
    private int numeroConvite;
    private LocalDate data;

    public Convite(int numeroConvite, LocalDate data) {
        this.numeroConvite = numeroConvite;
        this.data = data;
    }

    @Override
    public boolean podeEntrar(LocalDate date) {
        return this.data.equals(date);
    }
}

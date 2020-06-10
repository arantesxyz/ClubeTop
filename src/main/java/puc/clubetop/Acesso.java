package puc.clubetop;

import puc.clubetop.entities.Clubista;

import java.time.LocalDate;

public class Acesso {
    private Clubista clubista;
    private LocalDate data;

    public Acesso(Clubista clubista, LocalDate data) {
        this.clubista = clubista;
        this.data = data;
    }

    public Clubista getClubista() {
        return clubista;
    }

    public LocalDate getData() {
        return data;
    }
}

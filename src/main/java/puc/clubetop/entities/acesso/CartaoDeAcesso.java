package puc.clubetop.entities.acesso;

import java.time.LocalDate;

public interface CartaoDeAcesso {
    boolean podeEntrar(LocalDate date);
}

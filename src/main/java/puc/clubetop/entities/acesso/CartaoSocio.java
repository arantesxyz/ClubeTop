package puc.clubetop.entities.acesso;

import java.time.LocalDate;

public class CartaoSocio implements CartaoDeAcesso {
    private int socioId;

    public CartaoSocio(int socioId) {
        this.socioId = socioId;
    }

    @Override
    public boolean podeEntrar(LocalDate date) {
        // Talvez conferir o pagamento caso o modulo de pagamento seja implementado
        return date != null && socioId > -1;
    }
}

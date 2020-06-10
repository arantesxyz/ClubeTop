package puc.clubetop.entities;

import puc.clubetop.entities.acesso.CartaoDeAcesso;
import puc.clubetop.entities.acesso.Convite;

public class Visitante implements Clubista {
    private Convite convite;

    public Visitante(Convite convite) {
        this.convite = convite;
    }

    @Override
    public CartaoDeAcesso getCartaoDeAcesso() {
        return convite;
    }
}

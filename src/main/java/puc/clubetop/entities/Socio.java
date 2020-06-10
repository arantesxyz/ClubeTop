package puc.clubetop.entities;

import puc.clubetop.entities.acesso.CartaoDeAcesso;
import puc.clubetop.entities.acesso.CartaoSocio;

public class Socio implements Clubista {
    private CartaoSocio cartaoSocio;

    public Socio(int id) {
        this.cartaoSocio = new CartaoSocio(id);
    }

    @Override
    public CartaoDeAcesso getCartaoDeAcesso() {
        return cartaoSocio;
    }
}

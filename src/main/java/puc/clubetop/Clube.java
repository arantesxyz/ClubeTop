package puc.clubetop;

import puc.clubetop.entities.Clubista;
import puc.clubetop.entities.Visitante;
import puc.clubetop.exceptions.SemPermissao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clube {
    private List<Acesso> acessos;

    public Clube() {
        this.acessos = new ArrayList<>();
    }

    private boolean podeEntrarHoje(Clubista clubista) {
        return clubista.getCartaoDeAcesso().podeEntrar(LocalDate.now());
    }

    public void novoAcesso(Clubista clubista) throws SemPermissao {
        if (!podeEntrarHoje(clubista)) throw new SemPermissao("Sem permissão para acesso no dia de hoje");

        acessos.add(new Acesso(clubista, LocalDate.now()));
    }

    public List<Visitante> getVisitantes(final LocalDate date) {
        if (date == null) return acessos
                .stream()
                .filter(acesso -> acesso.getClubista() instanceof Visitante)
                .map(acesso -> (Visitante) acesso.getClubista())
                .collect(Collectors.toList());

        return acessos
                .stream()
                .filter(acesso -> acesso.getClubista() instanceof Visitante && acesso.getData().equals(date))
                .map(acesso -> (Visitante) acesso.getClubista())
                .collect(Collectors.toList());
    }

    public long getTotalClubistas(Class<? extends Clubista> clazz) {
        return acessos
                .stream()
                .filter(acesso -> clazz.isAssignableFrom(acesso.getClubista().getClass()))
                .count();
    }
}
















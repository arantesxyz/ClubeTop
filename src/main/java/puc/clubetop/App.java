package puc.clubetop;

import puc.clubetop.entities.Clubista;
import puc.clubetop.entities.Socio;
import puc.clubetop.entities.Visitante;
import puc.clubetop.entities.acesso.Convite;
import puc.clubetop.exceptions.SemPermissao;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        final Clube clube = new Clube();

        try {
            final Socio socio = new Socio(1);
            clube.novoAcesso(socio);

            System.out.println("\n=============================");
            System.out.println("Visitantes: " + clube.getVisitantes(LocalDate.now()));
            System.out.println("Total acessos: " + clube.getTotalClubistas(Clubista.class));
            System.out.println("Total socios: " + clube.getTotalClubistas(Socio.class));
            System.out.println("Total visitantes: " + clube.getTotalClubistas(Visitante.class));
            System.out.println("=============================");

            final Visitante visitante = new Visitante(new Convite(1, LocalDate.now()));
            clube.novoAcesso(visitante);

            System.out.println("\n=============================");
            System.out.println("Visitantes: " + clube.getVisitantes(LocalDate.now()));
            System.out.println("Total acessos: " + clube.getTotalClubistas(Clubista.class));
            System.out.println("Total socios: " + clube.getTotalClubistas(Socio.class));
            System.out.println("Total visitantes: " + clube.getTotalClubistas(Visitante.class));
            System.out.println("=============================");

            final Visitante visitante2 = new Visitante(new Convite(1, LocalDate.of(2019, 2, 12)));
            clube.novoAcesso(visitante2);
        } catch (SemPermissao e) {
            System.out.println(e.getMessage());
        }
    }
}

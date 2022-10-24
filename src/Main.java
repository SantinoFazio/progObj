import java.util.Date;

public class

Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(2022, 7, 18);

        Date finDeCursada = new Date(2022,11,5);

        Date fechaParcial = new Date(2022,8,29);

        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );

        Player estudianteSantino = new Player("Santino Fazio", "Aguatero");
        Player estudianteAntonella = new Player("Antonella Villani", "Aguatera suplente");
        Player profeSergio = new Player("Sergio Medina", "Dc");
        Player profeSuplente = new Player("Sergio Mario", "Ed");

        Team profesPoo = new Team("profespoo");
        profesPoo.addPlayer(profeSergio);
        profesPoo.addPlayer(profeSuplente);

        Team estudiantesPoo = new Team("alumnospoo");

        estudiantesPoo.addPlayer(estudianteSantino);
        estudiantesPoo.addPlayer(estudianteAntonella);



        Match primerParcial = new Match ("Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo

        );

    }
}

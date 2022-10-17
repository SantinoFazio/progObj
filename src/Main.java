import java.util.Date;

public class Main {
    public static void main(String[] args) {
    System.out.println("holaaa");

    Season torneoDaVinci= new Season();
        torneoDaVinci.setName("torneo 2022,2ndo cuatri");
        Date comienzoDeCursada = new Date();
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);
        torneoDaVinci.setStartDate(comienzoDeCursada);

    }

}

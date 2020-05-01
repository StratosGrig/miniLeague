
public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("SuperLeague");
        Team<FootballPlayer> Aris = new Team<>("Aris Thessaloniki");
        Team<FootballPlayer> Paok = new Team<>("Paok Thessaloniki");
        Team<FootballPlayer> Olympiakos = new Team<>("Olympiakos Athens");
        Team<FootballPlayer> Iraklis = new Team<>("Iraklis Thessaloniki");
        Team<FootballPlayer> Panathinaikos = new Team<>("Panathinaikos Athens");
        Team<FootballPlayer> Atromitos = new Team<>("Atromitos Athens");
        Team<FootballPlayer> Ksanthi = new Team<>("Skoda Ksanthi");


        Olympiakos.matchResult(Iraklis, 1, 0);
        Olympiakos.matchResult(Aris, 3, 4);

        Aris.matchResult(Iraklis, 2, 1);
        Aris.matchResult(Ksanthi, 3, 1);

        Paok.matchResult(Atromitos, 2, 2);

        Panathinaikos.matchResult(Paok,1,1);


        footballLeague.add(Aris);
        footballLeague.add(Paok);
        footballLeague.add(Olympiakos);
        footballLeague.add(Iraklis);
        footballLeague.add(Panathinaikos);
        footballLeague.add(Atromitos);
        footballLeague.add(Ksanthi);


        footballLeague.showLeagueTable();

    }
}

public class Testo {
    public Testo(String[] Deutsche, String[] ukler) {

        Deutscher[] Dliste = new Deutscher[Deutsche.length];
        Britain[] UKliste = new Britain[ukler.length];

        for (int i = 0; i < Deutsche.length; i++) {
            Dliste[i] = new Deutscher(Deutsche[i]);
            Dliste[i].getGruss();
            Dliste[i].getchef();
        }

        for (int i = 0; i < ukler.length; i++) {
            UKliste[i] = new Britain(ukler[i]);
            UKliste[i].getGruss();
            UKliste[i].getchef();
        }

    }
}

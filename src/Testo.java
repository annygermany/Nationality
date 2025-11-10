public class Testo {
    public Testo(String[] Deutsche, String[] ukler, String[] itler) {

        Deutscher[] Dliste = new Deutscher[Deutsche.length];
        Britain[] UKliste = new Britain[ukler.length];
        Italiener[] ITliste = new Italiener[ukler.length];

        for (int i = 0; i < Deutsche.length; i++) {
            Dliste[i] = new Deutscher(Deutsche[i],"Steinmeier", true);
            Dliste[i].getGruss();
            Dliste[i].getChefGruss();
            System.out.println(Dliste[i].istNeuanlage());

        }

        for (int i = 0; i < ITliste.length; i++) {
            ITliste[i] = new Italiener(itler[i],"Spaghetti");
            ITliste[i].getGruss();
            ITliste[i].getChefGruss();
        }


        for (int i = 0; i < ukler.length; i++) {
            UKliste[i] = new Britain(ukler[i]);
            UKliste[i].getGruss();
            UKliste[i].getChefGruss();
        }




    }
}

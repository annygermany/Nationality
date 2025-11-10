public class Mensch {

    public String menschVorname;
    public String menschChef;

    public Mensch(String vorname, String chef) {
        System.out.println("------");
        System.out.println("--- Superklasse Mensch wurde erstellt ---");
        this.menschVorname = vorname;
        this.menschChef = chef;
    }
    public String toUpperCase() {
        return "vvv " + this.menschVorname + " vvv";
    }

    public String getName() {
        return menschVorname;
    }

    public String getChef() {
        return menschChef;
    }
}

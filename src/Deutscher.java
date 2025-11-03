public class Deutscher {
    public String name;
    public String chef = "Steinmeier";

    public Deutscher() {
        this.name = "Michel";
    }

    public Deutscher(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void getGruss() {
        System.out.println("Guten Tach, mein Name ist " + getName() + ", ich komme aus Dland.");
    }

    public void getchef() {
        System.out.println("der Staatsoberhaupt ist " + this.chef);
    }
}

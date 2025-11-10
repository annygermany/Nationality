public class Deutscher extends Mensch {
    public String vorname;
    public boolean istNeuanlage;

    public Deutscher(String vorname, String chef, boolean istNeuanlage) {
        super(vorname, chef);
        this.vorname = vorname;
        this.istNeuanlage = istNeuanlage;

    }

    @Override
    public String getName() {
        return "--OVERRIDE--" + this.vorname.toUpperCase();
    }

    public void getGruss() {
        System.out.println("Guten Tach, mein Name ist " + getName() + ", ich komme aus Dland.");
    }

    public void getChefGruss() {
        System.out.println("der Staatsoberhaupt ist " + this.getChef());
    }

    public String istNeuanlage() {
        return istNeuanlage ? getName() +  " wurde neu angelegt" : getName() +  " besteht bereits" ;

    }

}

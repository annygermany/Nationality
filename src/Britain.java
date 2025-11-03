public class Britain {

    public String name;
    public String chef = "Mc Affee";

    public Britain() {
        this.name = "Harry Potter";
    }

    public Britain(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void getGruss() {
        System.out.println("Hi my name is " + getName());
    }

    public void getchef() {
        System.out.println("our head of the kingdom is " +this.chef);
    }
}

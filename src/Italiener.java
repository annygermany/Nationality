public class Italiener extends Mensch{


        public Italiener(String name, String chef) {
           super(name, chef);
        }


        public void getGruss() {
            System.out.println("Bongiorno, scuzi " + getName() + ", ich komme aus Dland.");
        }

        public void getChefGruss() {
            System.out.println("Pasta Boss ist  " + this.getChef());
        }

}

public class Italiener {

        public String name;
        public String chef = "Steinmeier";

        public Italiener() {
            this.name = "Michel";
        }

        public Italiener(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void getGruss() {
            System.out.println("Bongiorno, scuzi " + getName() + ", ich komme aus Dland.");
        }

        public void getchef() {
            System.out.println("Pasta " + this.chef);
        }

}

public class Progamierung {
    public static void main(String[] args) {
        Apfel apfel = new Apfel();
       // apfel.name = "Apfel";
        apfel.setFarbe("grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println(apfel.getName());
        System.out.println(apfel.getGewicht() + " Gram");

        Banane banane = new Banane();
        System.out.println(banane.getName());
        banane.setFarbe("gelb");

        System.out.println(banane.getFarbe());

        Apfel apfelNew = new Apfel();

    }
}

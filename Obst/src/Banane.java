public class Banane extends Obst {

    private double kreummung;

    public Banane() {
        super("Banane");
    }

    public double getKruemmung() {
        return kreummung;

    }

    public void setKruemmung(double kruemmung) {
        this.kreummung = kruemmung; }

        @Override
        public String toString () {
            String text = super.toString();
            text += "\n\tKrümmung = " + kreummung;
            return text;
        }
    }

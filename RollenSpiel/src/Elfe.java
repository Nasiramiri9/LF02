public class Elfe extends spielfigur {
    public Elfe(String name, int staerkepunkte){
        super(name,staerkepunkte);
    }
    public void rennen(){
        if (getStaerkepunkte()  >= -2){
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "Laufte");
        }
    }
    public String toString(){
        return super.toString();
    }
}

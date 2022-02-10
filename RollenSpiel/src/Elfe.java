public class Elfe extends spielfigur {
    public Elfe(String name, int staerkepunkte){
        super(name,staerkepunkte);
    }
    public void rennen() throws KeineKraftException {
        if (getStaerkepunkte()  >= -2){
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "rennen");
        }
        else {
            throw new KeineKraftException(getName(), "rennen");
        }
    }
    public String toString(){
        return super.toString();
    }
}

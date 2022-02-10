public class Zauberer extends spielfigur {

    private int zauberpukte;

    public Zauberer(String  name,int staerkepukte, int zauberpukte ){
        super(name,staerkepukte);
        this.zauberpukte = zauberpukte;
    }
    public int getZauberpukte(){
        return zauberpukte;
    }
    public void trinkzaubertrank(){
        zauberpukte += 3;
        System.out.println(getName() + "trinken");

    }
    public void zaubern() throws KeineKraftException {
        if (getStaerkepunkte() >= 1){
            zauberpukte --;
            System.out.println(getName() + "zaubern");
        }
        else {
            throw new KeineKraftException(getName() , "zaubern");
        }
    }

    @Override
    public String toString(){
        String text = super.toString();
        text += "\n\tzaubern" + zauberpukte;

        return text;


    }

}

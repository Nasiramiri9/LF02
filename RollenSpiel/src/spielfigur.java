public class spielfigur {
    private String name;
    private int staerkepunkte;

    public spielfigur(String name, int staerkepunkte){
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName(){
        return name;
    }
    public int getStaerkepunkte(){
        return staerkepunkte;
    }
   protected void setStaerkepunkte(int staerkepunkte){
        this.staerkepunkte = staerkepunkte;
   }
   public void essen(){
        staerkepunkte = staerkepunkte + 10;
   }
   public void laufen(){
     if (getStaerkepunkte() >= 1){
         setStaerkepunkte(getStaerkepunkte() - 1);
         System.out.println(getName() + "Laufet");
     }

   }


    public void klettern(){
        if (getStaerkepunkte() >= 2){
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "Laufet");
        }
   }
   public void kaemfen(){
       if (getStaerkepunkte() >= 3){
           setStaerkepunkte(getStaerkepunkte() -3);
           System.out.println(getName() + "Laufte");
       }
   }

   @Override
    public String toString(){
        String text = "";
        text += "\n\tname = " + name;
        text += "\n\tstaerkepunkte = " + staerkepunkte;

        return text;
   }



}

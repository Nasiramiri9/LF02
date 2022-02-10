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
   public void laufen() throws KeineKraftException {


        if (getStaerkepunkte() >= 1){
         setStaerkepunkte(getStaerkepunkte() - 1);
         System.out.println(getName() + "Laufet");
     }
     else{
         throw new KeineKraftException(name, "laufen");
     }

   }


    public void klettern() throws KeineKraftException {
        if (getStaerkepunkte() >= 2){
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "klettern");
        }
        else {
            throw new KeineKraftException(name,"Laufen");
        }
   }
   public void kaemfen() throws KeineKraftException {
       if (getStaerkepunkte() >= 3){
           setStaerkepunkte(getStaerkepunkte() -3);
           System.out.println(getName() + "kämpfen");
       }
       else {
           throw new KeineKraftException(name,  "kämpfen");

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

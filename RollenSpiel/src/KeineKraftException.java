public class KeineKraftException extends Exception{
    private String name;
    private String aktion;

    public KeineKraftException(String name, String aktion){
        super();
        this.name = name;
        this.aktion = aktion;
    }
    public String getMessage(){
        return name + "ist zu schwach zum" + aktion;
    }
}

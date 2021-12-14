package uaslp.objetos.escuela;

public class SalaDeJuntasB extends SalaDeJuntas {

    private static SalaDeJuntasB uniqueInstance;

    public String getNombre(){
        return "Sala B";
    }

    static public SalaDeJuntasB getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new SalaDeJuntasB();
        }
        return uniqueInstance;
    }
}
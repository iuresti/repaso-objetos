package uaslp.objetos.escuela;

public class SalaDeJuntasA extends SalaDeJuntas {

    private static SalaDeJuntasA uniqueInstance;

    public String getNombre(){
        return "Sala A";
    }

    static public SalaDeJuntasA getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new SalaDeJuntasA();
        }
        return uniqueInstance;
    }

}
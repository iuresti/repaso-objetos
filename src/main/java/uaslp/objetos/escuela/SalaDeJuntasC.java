package uaslp.objetos.escuela;

public class SalaDeJuntasC extends SalaDeJuntas {

    private static SalaDeJuntasC uniqueInstance;

    public String getNombre(){
        return "Sala C";
    }

    static public SalaDeJuntasC getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new SalaDeJuntasC();
        }
        return uniqueInstance;
    }
}
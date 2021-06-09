package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String name) {
        switch (name){
            case "Sala A":
                return SalaA.getInstance();
            case "Sala B":
                return SalaB.getInstance();
            case "Sala C":
                return SalaC.getInstance();
            default: return null;
        }
    }
}

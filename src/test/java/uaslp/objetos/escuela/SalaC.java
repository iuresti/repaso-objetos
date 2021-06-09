package uaslp.objetos.escuela;

public class SalaC extends SalaDeJuntas{
    private SalaC(){
        this.name="Sala C";
    }

    private static class SalaAHolder{
        static final SalaC INSTANCE= new SalaC();
    }

    public static SalaC getInstance(){
        return SalaC.SalaAHolder.INSTANCE;
    }
}

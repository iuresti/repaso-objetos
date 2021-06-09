package uaslp.objetos.escuela;

public class SalaA extends SalaDeJuntas{
    private SalaA(){
        this.name="Sala A";
    }

    private static class SalaAHolder{
        static final SalaA INSTANCE= new SalaA();
    }

    public static SalaA getInstance(){
        return SalaA.SalaAHolder.INSTANCE;
    }
}

package uaslp.objetos.escuela;

public class SalaB extends SalaDeJuntas{
    private SalaB(){
        this.name="Sala B";
    }

    private static class SalaAHolder{
        static final SalaB INSTANCE= new SalaB();
    }

    public static SalaB getInstance(){
        return SalaB.SalaAHolder.INSTANCE;
    }
}
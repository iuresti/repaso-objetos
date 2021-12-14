package uaslp.objetos.escuela;

public class Direccion {

    private Direccion(){
    }

    private static class DireccionHolder{
        static final Direccion INSTANCE = new Direccion();
    }

    public static Direccion getInstance() {
        return DireccionHolder.INSTANCE;
    }
}
package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo {
    private String description;
    private static final String name="Triangulo Escaleno";

    public TrianguloEscaleno(){
        this.description="Lados diferentes";
    }

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name;
    }
}

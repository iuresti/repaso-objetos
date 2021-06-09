package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo {
    private String description;
    private static final String name="Triangulo Isoceles";

    public TrianguloIsoceles(){
        this.description="2 Lados iguales y 1 diferente";
    }

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name;
    }
}

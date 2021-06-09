package uaslp.objetos.figuras;

public class Triangulo implements Figura {
    private double base;
    private double altura;
    private double area;
    private String description;
    private String name;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.name = "Triangulo";
        this.description = "Cualquier triangulo";
    }

    public Triangulo() {
        this.name = "Triangulo";
        this.description = "Cualquier triangulo";
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;

    }

    public double getArea() throws DatoFaltanteException {
        if(base<=0)
            throw new BaseNoProvistaException();
        if(altura<=0)
            throw new AlturaNoProvistaException();
        area = (base*altura)/2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}

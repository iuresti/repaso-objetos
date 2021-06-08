package uaslp.objetos.figuras;

public class Cuadrado {
    private double area;
    private double lado;

    public Cuadrado(double lado) {
        this.lado=lado;
    }

    public Cuadrado() {

    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        area = lado*lado;
        return area;
    }

    public double getLado() {
        return lado;
    }
}

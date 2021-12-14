package uaslp.objetos.figuras;

public class Cuadrado implements Figura {

    private Double lado;
    private double area;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado=lado;
    }

    public double getArea() throws LadoNoProvistoException {
        if(lado == null){
            throw new LadoNoProvistoException();
        }
        area = lado*lado;
        return area;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName() {
        return "Cuadrado";
    }
}
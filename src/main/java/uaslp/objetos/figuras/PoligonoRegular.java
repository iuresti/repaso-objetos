package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{

    private int numeroDeLados;
    private double lado;
    private double area;

    public PoligonoRegular(int numeroDeLados) {
        if(numeroDeLados < 5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        area=(lado/2)/Math.tan(Math.toRadians((double) 360/numeroDeLados)/2)*(lado/2)/Math.tan(Math.toRadians((double) 360/numeroDeLados)/2)*numeroDeLados*Math.tan(Math.PI/numeroDeLados);
        return area;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
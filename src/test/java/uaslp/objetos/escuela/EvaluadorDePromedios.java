package uaslp.objetos.escuela;


import java.util.List;

public class EvaluadorDePromedios {
    private double promedio;

    public double evalua(List<Double> calificaciones) {
        double sum = calificaciones.stream().reduce(0.0, Double::sum);
        promedio = sum / calificaciones.size();

        return promedio;
    }
}

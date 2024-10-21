package modelos;

import java.util.Map;

public class Moneda {
    private String codigoMoneda;
    private Map<String,Double> ratiosMoneda;

    public String getcodigoMoneda() {
        return codigoMoneda;
    }

    public void setcodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public Map<String, Double> getRatiosMoneda() {
        return ratiosMoneda;
    }

    public void setRatiosMoneda(Map<String,Double> ratiosMoneda) {
        this.ratiosMoneda = ratiosMoneda;
    }

    //METODOS

    @Override
    public String toString() {
        return "Moneda{" +
                "codigoMoneda='" + codigoMoneda + '\'' +
                ", ratiosMoneda=" + ratiosMoneda +
                '}';
    }
}

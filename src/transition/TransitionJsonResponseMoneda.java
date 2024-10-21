package transition;

import com.google.gson.Gson;
import conectandolaapi.ConexionApi;
import dtos.ResponseMoneda;
import modelos.Moneda;

import java.io.IOException;

public class TransitionJsonResponseMoneda {

    //ATRIBUTOS

    private String json ;
    private ResponseMoneda responseMoneda;
    private Moneda moneda;
    private String codigoMonda;

    public TransitionJsonResponseMoneda(String codigoMoneda) {
        this.codigoMonda = codigoMoneda;
        setJson(getJson());
        setResponseMoneda(getResponseMoneda());
    }

    //GETTERS AND SETTERS

    public String getCodigoMonda() {
        return codigoMonda;
    }

    public void setCodigoMonda(String codigoMonda) {
        this.codigoMonda = codigoMonda;
    }

    public String getJson() {
        //HACEMOS EL LLAMADO A LA API Y TRAEMOS EL JSON

        ConexionApi con = new ConexionApi(codigoMonda);
        try {
            return con.getJson();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setJson(String json) {
        this.json = getJson();
    }

    public ResponseMoneda getResponseMoneda() {
        //==============================================
        //INICIALIZAMOS LA LISTA DE RATIOS PARA AGRAGAR CADA RATIO QUE VAMOS A ITERAR
        //==============================================
        //List<Ratio> listaRatiosDeMoneda = new ArrayList<>();

        //==============================================
        //INICIALIZAMOS EL OBJETO RATIO PARA AGRAGARLE VALORES
        //==============================================
        //Ratio ratio = new Ratio();

        //==============================================
        //INICIAMOS EL GSON PARA MANIPULAR EL JSON
        //==============================================
        Gson gson = new Gson();
        responseMoneda = gson.fromJson(json, ResponseMoneda.class);
/*
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = obj.getAsJsonObject("conversion_rates");

        for (Map.Entry<String, JsonElement> entry : conversionRates.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            ratio.setcodigoMoneda(key);
            ratio.setRatioMoneda(value.getAsDouble());

            listaRatiosDeMoneda.add(ratio);
            //System.out.println("codigo : "+key + " ==  valor : "+ value);
        }
        responseMoneda.setRatios(listaRatiosDeMoneda);
 */
        return responseMoneda;
    }

    public void setResponseMoneda(ResponseMoneda responseMoneda) {
        this.responseMoneda = responseMoneda;
    }

    //METODOS


    public Moneda getMoneda() {
        moneda = new Moneda();
        moneda.setcodigoMoneda(responseMoneda.getBase_code());
        moneda.setRatiosMoneda(responseMoneda.getRatios());
        return moneda;

    }


}

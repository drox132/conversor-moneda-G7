package dtos;


import com.google.gson.annotations.SerializedName;


import java.util.Map;

public class  ResponseMoneda{

    //ATRIBUTOS
            String result;
            String documentation;
            String terms_of_use;
            String time_last_update_unix;
            String time_last_update_utc;
            String time_next_update_unix;
            String time_next_update_utc;
            String base_code;
            @SerializedName("conversion_rates")
            Map<String, Double> ratios;
            // List<Ratio> ratios;



    //CONSTRUCTOR
    public ResponseMoneda(String result
            , String documentation
            , String terms_of_use
            , String time_last_update_unix
            , String time_last_update_utc
            , String time_next_update_unix
            , String time_next_update_utc
            , String base_code
            , Map<String, Double> ratios)
            //, List<Ratio> ratios)
    {
        this.result = result;
        this.documentation = documentation;
        this.terms_of_use = terms_of_use;
        this.time_last_update_unix = time_last_update_unix;
        this.time_last_update_utc = time_last_update_utc;
        this.time_next_update_unix = time_next_update_unix;
        this.time_next_update_utc = time_next_update_utc;
        this.base_code = base_code;
        this.ratios = ratios;
    }

    public ResponseMoneda() {

    }

    //GETTERS AND SETTERS

    public void setRatios(Map<String, Double> ratios) {
        this.ratios = ratios;
    }
    public Map<String, Double> getRatios() {
        return ratios;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public String getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public void setTime_last_update_unix(String time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public void setTime_next_update_unix(String time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }



    //METODOS
    @Override
    public String toString() {
        return "ResponseMoneda{" +
                "result='" + result + '\'' +
                ", \n documentation='" + documentation + '\'' +
                ", \n terms_of_use='" + terms_of_use + '\'' +
                ", \n time_last_update_unix='" + time_last_update_unix + '\'' +
                ", \n time_last_update_utc='" + time_last_update_utc + '\'' +
                ", \n time_next_update_unix='" + time_next_update_unix + '\'' +
                ", \n time_next_update_utc='" + time_next_update_utc + '\'' +
                ", \n base_code='" + base_code + '\'' +
                ", \n ratios=" + ratios +
                '}';
    }
}


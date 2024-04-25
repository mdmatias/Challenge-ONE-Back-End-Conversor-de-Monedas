import java.util.Map;

public class Divisa {
    private String result;
    private String documentacion;
    private String terms_of_use;
    private long time_last_update_unix;
    private String time_last_update_utc;
    private long time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private Map<String, Double> conversion_rates;

    public Divisa(Map<String, Double> conversionRates) {
        conversion_rates = conversionRates;
    }

    public String getResult() {
        return result;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public long getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public long getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map <String, Double> getConversionRates() {
        return conversion_rates;
    }
}

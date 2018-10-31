package io.lamar.cryptonatorAPI.currency;

public class Converter {

    private Ticker ticker;

    private  Long timestamp;

    private boolean success;

    private String error;


    public Converter(Long timestamp, boolean success, String error, Ticker ticker) {
        this.timestamp = timestamp;
        this.success = success;
        this.error = error;
        this.ticker=ticker;
    }

    public Converter() {

    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "ticker=" + ticker +
                ", timestamp=" + timestamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}




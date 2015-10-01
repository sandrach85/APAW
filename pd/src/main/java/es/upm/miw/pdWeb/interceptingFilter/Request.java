package es.upm.miw.pdWeb.interceptingFilter;

public class Request {

    private String value;

    public Request() {
        value = "";
    }

    public String getValue() {
        return value;
    }

    public void addValue(String value) {
        this.value += "-" + value;
    }

    @Override
    public String toString() {
        return "Request[" + value + "]";
    }

}

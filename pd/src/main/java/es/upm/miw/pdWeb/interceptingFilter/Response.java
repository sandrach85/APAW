package es.upm.miw.pdWeb.interceptingFilter;

public class Response {

    private String value;

    public Response() {
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
        return "Response[" + value + "]";
    }

}

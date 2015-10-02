package es.upm.miw.pdWeb.interceptingFilter;

import java.util.HashMap;
import java.util.Map;

public class Response {

    private Map<String, String> cookies;

    private Map<String, String> headers;

    private String status;

    private Object body;

    public Response() {
        cookies = new HashMap<>();
        headers = new HashMap<>();
        status = "";
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, String> cookies) {
        this.cookies = cookies;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Response [cookies=" + cookies + ", headers=" + headers + ", status=" + status + "]";
    }

}

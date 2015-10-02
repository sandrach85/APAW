package es.upm.miw.pdWeb.interceptingFilter;

import java.util.HashMap;
import java.util.Map;

public class Request {

    private String path;

    private Map<String, String> cookies;

    private Map<String, String> headers;

    private Map<String, String> params;
    
    private Object body;

    public Request() {
        path = "/";
        cookies = new HashMap<>();
        headers = new HashMap<>();
        params = new HashMap<>();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Request[path=" + path + ", cookies=" + cookies + ", headers=" + headers + ", params=" + params + "]";
    }

}

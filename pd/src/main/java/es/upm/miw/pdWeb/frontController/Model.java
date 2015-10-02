package es.upm.miw.pdWeb.frontController;

import java.util.HashMap;
import java.util.Map;

public class Model {
    private Map<String, String> map = new HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public String get(String key) {
        return map.get(key);
    }
}

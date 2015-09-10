package es.upm.miw.pd.command;

import java.util.HashMap;
import java.util.Map;

public class Invocador {
    private Map<String, Orden> ordenes;

    public Invocador() {
        this.ordenes = new HashMap<>();
    }

    public void añadir(Orden orden) {
        this.ordenes.put(orden.name(), orden);
    }

    public void invocar(String llave) {
        this.ordenes.get(llave).ejecutar();
    }

    public String[] llaves() {
        return this.ordenes.keySet().toArray(new String[0]);
    }
}

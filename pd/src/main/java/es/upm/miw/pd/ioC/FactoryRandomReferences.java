package es.upm.miw.pd.ioC;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FactoryRandomReferences implements FactoryReferences {

    private Map<String, Integer> references;

    private Random random;

    public FactoryRandomReferences() {
        this.references = new HashMap<>();
        random = new Random();
    }

    @Override
    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            int reference = random.nextInt();
            while (references.containsValue(reference)) {
                reference++;
            }
            this.references.put(key, reference);
            result = reference;
        }
        return result;
    }

    @Override
    public void removeReference(String key) {
        this.references.remove(key);
    }

}

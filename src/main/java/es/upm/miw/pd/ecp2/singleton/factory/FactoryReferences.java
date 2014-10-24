package es.upm.miw.pd.ecp2.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references;

    private int reference;
    private static FactoryReferences factoryReferences=null;

    public FactoryReferences() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    public static FactoryReferences getFactoryReferences() {
        if (FactoryReferences.factoryReferences == null) {
        	FactoryReferences.factoryReferences = new FactoryReferences();
        }
        return FactoryReferences.factoryReferences;
    }
    
    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}

package es.upm.miw.pd.singleton.factory.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ReferencesFactoryTest {

    @Test
    public void testReferencesFactoryIsSingleton() {
        assertSame(FactoryReferences.getFactory(), FactoryReferences.getFactory());
    }

    @Test
    public void testReferencesFactorySingletonNotNull() {
        assertNotNull(FactoryReferences.getFactory());
    }

    @Test
    public void testReferencesFactory() {
        assertEquals(0, FactoryReferences.getFactory().getReference("cero"));
        assertEquals(1, FactoryReferences.getFactory().getReference("uno"));
        FactoryReferences.getFactory().removeReference("cero");
        assertEquals(2, FactoryReferences.getFactory().getReference("cero"));
    }
}

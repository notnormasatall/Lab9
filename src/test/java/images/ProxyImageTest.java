package images;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxy;

    @BeforeEach
    void setUp() {
        proxy = new ProxyImage("tito.png");
    }

    @Test
    void checkAttributes() {
        assertEquals(proxy.getFilename(), "tito.png");
        assertEquals(proxy.getRealimage(), null);
    }
}
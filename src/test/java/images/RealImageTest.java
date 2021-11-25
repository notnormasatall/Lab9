package images;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RealImageTest {
    RealImage realImage;

    @BeforeEach
    void setUp() {
        realImage = new RealImage("tito.txt");
    }

    @Test
    void checkAttributes() {
        assertEquals(realImage.getFilename(), "tito.txt");
    }
}
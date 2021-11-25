package mails;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Tito", 19, Gender.FEMALE, "tito@gmail.com");
    }

    @Test
    void testAttributes() {
        assertEquals(client.getID(), 0);
        assertEquals(client.getAge(), 19);
        assertEquals(client.getMail(), "tito@gmail.com");
        assertEquals(client.getSex(),Gender.FEMALE);
    }
}
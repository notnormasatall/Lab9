package mails;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MailInfoTest {
    MailInfo info;

    @BeforeEach
    void setUp() {
        Client client = new Client("Tito", 19, Gender.FEMALE, "tito@gmail.com");
        info = new MailInfo();
        info.setClient(client);
        info.setMailCode(MailCode.GREETINGS);
    }

    @Test
    void getMailText() throws FileNotFoundException {
        System.out.println(info.getMailText());
        assertEquals(info.getMailText(), "HB, Tito!\n");
    }
}
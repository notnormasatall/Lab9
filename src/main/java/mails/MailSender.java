package mails;

import java.io.FileNotFoundException;

public class MailSender {

    public void sendMail(MailInfo data) throws FileNotFoundException {
        System.out.println(data.getMailText() + "\nData sent to " + data.getClientEmail());
    }
}

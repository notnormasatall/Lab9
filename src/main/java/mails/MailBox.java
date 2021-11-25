package mails;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> text = new ArrayList<>();

    public void addInfo(MailInfo newInfo) {
        text.add(newInfo);
        System.out.println("New data added!");
    }

    public void sendAll() throws FileNotFoundException {
        MailSender sender = new MailSender();

        for (MailInfo info: text) {
            sender.sendMail(info);
        }
    }
}

package mails;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getMailText() throws FileNotFoundException {

        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", (Integer.toString(client.getAge())));

        for(String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }

        return text;
    }

    public String getClientEmail() {
        return client.getMail();
    }
}

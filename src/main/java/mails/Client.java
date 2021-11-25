package mails;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private int ID;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client() {
        this.ID = ClientIdGenerator.genId();
    }

    public Client(String name, int age, Gender sex, String mail) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ID = ClientIdGenerator.genId();
        this.mail = mail;
    }

    private static class ClientIdGenerator {
        private static int counter = 0;

        public static int genId() {
            return counter++;
        }
    }
}

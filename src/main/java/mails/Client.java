package mails;

import lombok.Getter;

@Getter
public class Client {
    private int ID;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client() {
        this.ID = ClientIdGenerator.genId();
    }

    public Client(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ID = ClientIdGenerator.genId();
    }

    private static class ClientIdGenerator {
        private static int counter = 0;

        public static int genId() {
            return counter++;
        }
    }
}

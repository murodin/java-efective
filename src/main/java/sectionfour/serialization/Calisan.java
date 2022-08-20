package sectionfour.serialization;

import java.io.Serializable;

public class Calisan  implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final int age;
    private final String gender;

    Calisan(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
    }
}

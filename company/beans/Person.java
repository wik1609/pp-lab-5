package company.beans;
import company.exceptions.InvalidAgeException;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Nieprawidłowy wiek. Wiek musi mieścić się w zakresie od 0 do 125");
        }
        this.name = name;
        this.age = age;
    }
    public String getName() { //getter dla Name
        return name;
    }

    public void setName(String name) { //setter dla name
        this.name = name;
    }

    public int getAge() { //getter dla Age
        return age;
    }

    public void setAge(int age) { //setter dla Age
        this.age = age;
    }
}

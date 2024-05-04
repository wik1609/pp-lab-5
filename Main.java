import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        try {
            Person[] people = new Person[5]; // tablica dla 5 osób

            people[0] = new Person("John Doe", 30); //instancja osób
            people[1] = new Person("Jan Kula", 36);
            people[2] = new Person("Robert Lewandowski", 35);
            people[3] = new Person("Adam Bomba", 18);
            people[4] = new Person("Kuba Drozd", 23);

            int b = 10; // stała b

            //wyliczanie wartosci dla kazdej osoby(a-wiek, b-utworzona stała)
            for (int i = 0; i < people.length; i++) {
                int value = MathUtils.add(people[i].getAge(), b);
                Messenger messenger = new EmailMessenger();
                messenger.sendMessage("Wartość dla " + people[i].getName() + ": " + value);
            }
            

        } catch (InvalidAgeException e){
            System.out.println("Invalid age: " + e.getMessage()); //obsluga wyjatku gdy  wiek jest nieprawidlowy
        }
    }
    }


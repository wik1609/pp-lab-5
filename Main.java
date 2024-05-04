import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
public class Main {
    public static void main(String[] args) {
        try{
            Person person = new Person("Jan Kula", 36); //stworzona instancja Person

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());//wyswietlanie informacji o osobie

            Messenger messenger = new EmailMessenger();

            messenger.sendMessage("Wiadomość email.");

        } catch (InvalidAgeException e){
            System.out.println("Invalid age: " + e.getMessage()); //obsluga wyjatku gdy  wiek jest nieprawidlowy
        }
    }

}

import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        try{
            Person person = new Person("Jan Kula", 36); //stworzona instancja Person

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());//wyswietlanie informacji o osobie

            int result = MathUtils.add(3, 8);
            System.out.println("Sum: " + result); //dodawanie dwoch liczb i wysylanie wyniku w tresci wiadomosci

            Messenger messenger = new EmailMessenger(); //tworzenie instancji emailmessenger i metoda sendmessage

            messenger.sendMessage("Wynik dodawania: " + result);

        } catch (InvalidAgeException e){
            System.out.println("Invalid age: " + e.getMessage()); //obsluga wyjatku gdy  wiek jest nieprawidlowy
        }
    }

}

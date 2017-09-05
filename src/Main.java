import Person.Person;
import Person.Gender;

public class Main {

    public static void main ( String[] args ) {
        Person nick = new Person (Gender.MAN, "Nick");
        Person dan = new Person (Gender.MAN, "Dan");
        Person jenny = new Person (Gender.WOMAN, "Jenny");
        Person liz = new Person (Gender.WOMAN, "Liz");
        System.out.println ("Nick + Jenny = " + nick.Marry (jenny));
        System.out.println ("Nick + Liz = " + nick.Marry (liz));
        System.out.println ("Nick + Dan = " + nick.Marry (dan));
        System.out.println ("Dan + Liz = " + liz.Marry (dan));
        System.out.println ();
    }
}
package fr.aelion;

import fr.aelion.models.Person;
import fr.aelion.models.Student;

public class Main {
    private static Main app;

    public static void main(String[] args) {
        app = new Main();
        if (app instanceof Main) {
            // System.out.print("you are a main object");

            System.out.println("I am the main method");
        } else {
            // System.out.println("your not Main object");

            System.out.println("i am the Main method");
        }
        /**
         * class contructor : trigger when an instance of this Class is created
         *  */}

    public Main() {
        Person Jl = new Person();
        Jl.setFirstName("deroo");
        Jl.setLastName("regis");
        Jl.setPhoneNumber("0607238967");
        Jl.setEmail("regis.deroo@hotmail.com");

        System.out.println("Bonjour je m'appele " + Jl.greetings());

        Person jt = new Person();
        jt.setLastName("blub");
        jt.setFirstName("jean");
        jt.setEmail("jean.hgeeg@hotmail.com");
        jt.setPhoneNumber("0645285685");

        System.out.println("Bonjour je m'appele " + jt.greetings());

        Person mel = new Person("toto","titi","06157854","redgbooost78@msn.com");
        System.out.println("Bonjour je m'appele " + mel.greetings());
        Person bond = new Person("titi","redgbooost78@msn.com");
        System.out.println("Bonjour je m'appele " + bond.greetings());

        Student student = new Student("regis","deroo","azerty");
        student.setUserName("redg");
        student.setPassword("azerty");
        if (!student.IsLoggedIn()) {
            if (student.login("redg","azerty")) {
                System.out.println("bonjour" + student.firstName +" " +student.lasName);
            }else {
                System.out.println("désolé, mais aucun utilisateur ne corespond a vos identifiant");
            }
        }
        if ((student.IsLoggedIn())) {
            student.logout();
        }
        if (!student.login("toto","tata")) {
            System.out.println("desolé mais aucun utilisateur ne corespond a ces identifiants");
        }
    }

    public Main(String name) {
        System.out.println("Hello  " + name);

    }
}


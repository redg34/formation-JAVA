package fr.aelion.helpers.strategies.student;

import fr.aelion.models.Student;

public class FirstanameLastNameStrategy extends IHelloStrategy {
    @Override
    public String greetings(Student student) {
        return student.getFirstName() + " " + student.getLastName();
    }
}
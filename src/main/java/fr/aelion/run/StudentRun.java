package fr.aelion.run;

import fr.aelion.helpers.StudentBuilder;
import fr.aelion.helpers.exceptions.StudentException;
import fr.aelion.helpers.strategies.student.FirstanameLastNameStrategy;
import fr.aelion.helpers.strategies.student.LastNameFirstNameStrategy;
import fr.aelion.models.Student;

public class StudentRun {
    public static void run() {
        try {
            Student student = ((StudentBuilder) StudentBuilder.getInstance())
                    .lastName("Aubert")
                    .firstName("Jean-Luc")
                    .phoneNumber("06 55 22 33 66")
                    .email("jean-luc.aubert@aelion.fr")
                    .username("jlaubert")
                    .password("dacodemaniak")
                    .build();
            // le student voudrait dire bonjour
            student.setStrategy(new LastNameFirstNameStrategy());
            System.out.println("Bonjour je suis" +  student);
        } catch (StudentException e) {
            System.out.println(e.getMessage());
        }

    }
}
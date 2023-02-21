package fr.aelion.services.course;

import fr.aelion.repositories.course.Course;

public class DisplayCourse {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public  String  displayBuilder(){
       final String[] output = new String[1];

     output[0] = "course : " + course.getTitle() + "\n";
      //next display the list oh title of specific Medias
     course.getMedia().forEach(media ->{
        output[0] += media.getTitle() + "\n";
     });
     return  output[0];
    }
}

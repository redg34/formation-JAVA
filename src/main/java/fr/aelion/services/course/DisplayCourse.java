package fr.aelion.services.course;

import fr.aelion.repositories.course.Course;

public class DisplayCourse {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public  void  display(){
      System.out.println("course : " + course.getTitle());
      //next display the list oh title of specific Medias
     course.getMedia().forEach(media ->{
         System.out.println();
     });
    }
}

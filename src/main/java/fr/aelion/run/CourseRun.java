package fr.aelion.run;

import fr.aelion.models.course.Document;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;
import fr.aelion.repositories.course.Course;
import fr.aelion.services.course.DisplayCourse;

public class CourseRun {
    private Course course = new Course();
    public CourseRun(){
        this.course.setTitle("SQL");
        this.makeCourse();
    }

    public  void  run(){
        DisplayCourse displayCourse = new DisplayCourse();
        displayCourse.setCourse(this.course);
        displayCourse.display();
    }

    private void  makeCourse( ) {
        Media video = new Video();
        video.setTitle("create table");

        Media slide = new Slide();
        slide.setTitle("after table");

        Media document = new Document();
        document.setTitle("drop table");

        this.course.addMedia(video);
        this.course.addMedia(slide);
        this.course.addMedia(document);


    }
}

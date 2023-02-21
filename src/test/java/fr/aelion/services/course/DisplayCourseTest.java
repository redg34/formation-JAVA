package fr.aelion.services.course;

import fr.aelion.models.course.Media;
import fr.aelion.models.course.Video;
import fr.aelion.repositories.course.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class DisplayCourseTest {


    private  DisplayCourse displayCourse;
    private  StringBuilder expected = new StringBuilder();

    @BeforeEach
    void setUp() {
        Course course = new Course();
        Media video = new Video();
        video.setTitle("video test");

        course.setTitle("test");
        course.addMedia(video);

        //what i expect as outpout displauCourse
        expected
                .append("course : test") // Ref to displayBuilder
                .append("\n")
                .append("video test") // Ref to video.setTitle
                .append("\n");

        displayCourse = new DisplayCourse();
        displayCourse.setCourse(course);
    }

    @Test
    @DisplayName("Should display the wole course")
    void displayBuilder() {
        assertEquals(expected.toString(), displayCourse.displayBuilder());
    }
}
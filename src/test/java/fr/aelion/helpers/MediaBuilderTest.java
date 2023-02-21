package fr.aelion.helpers;

import fr.aelion.models.course.Author;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MediaBuilderTest {
    private MediaBuilder mediaBuilder = new MediaBuilder();
    private MediaBuilder badBuilder = new MediaBuilder();

    @BeforeEach
    void setUp() {
        mediaBuilder.setMediaType("video");
        mediaBuilder
                .title("Test")
                .summary("Joli test de builder")
                .duration(5.35F)
                .author(new Author());


        badBuilder.setMediaType("slide");
        badBuilder
                .author(new Author())
                .summary("l'object ne sera pas creer ")
                .title("no name");
    }

    @Test
    @DisplayName("Should have correct attribute values")
    void attributesTest() {
        Media video = null;
        try {
            video = mediaBuilder.build();
            Float duration = 5.35F;
            Media finalVideo = video;
            assertAll(
                    () -> assertEquals("Test", finalVideo.getTitle()),
                    () -> assertEquals("Joli test de builder", finalVideo.getSummary()),
                    () -> assertEquals(duration, finalVideo.getDuration()),
                    () -> assertTrue(finalVideo.getAuthor() instanceof Author)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @DisplayName("Should be an instanceof Video class")
    void build() {
        try {
            Media media = mediaBuilder.build();
            assertTrue(media instanceof Video);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    @DisplayName("Title should be 'Test'")
    void titleAttributeTest() {
        Media video = null;
        try {
            video = mediaBuilder.build();
            assertEquals("Test", video.getTitle());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    @DisplayName("should have correct atribute values")
    void attributeTest() {
        try {
            Media video = mediaBuilder.build();
            Float duration = 5.35F;
            assertAll(
                    () -> assertEquals("Test", video.getTitle()),
                    () -> assertEquals("Joli test de builder", video.getSummary()),
                    () -> assertEquals(duration, video.getDuration()),
                    () -> assertTrue(video.getAuthor() instanceof Author)
            );
        } catch(Exception e) {

        }
    }

    @Test
    @DisplayName("Not enought args should raised an Exception")
    void notEnoughAttribute() {
        assertThrows(Exception.class, () -> badBuilder.build());

    }


    @Test
    @DisplayName("no type should raise  an Exception")
    void noType() {
        MediaBuilder bad = new MediaBuilder();
        bad
                .title("bad")
                .summary("bad")
                .author(new Author())
                .duration(5.35F);
        assertThrows(Exception.class, () -> bad.build());

    }
}
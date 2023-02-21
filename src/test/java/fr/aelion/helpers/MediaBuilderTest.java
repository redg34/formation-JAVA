package fr.aelion.helpers;

import fr.aelion.models.course.Author;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaBuilderTest {
private  MediaBuilder mediaBuilder = new MediaBuilder();
    @BeforeEach
    void setUp() {
        mediaBuilder.setMediaType("video");
        mediaBuilder
                .title("test")
                .summary("joli test de builder")
                .duration(5.35F)
                .author(new Author());
    }

        @Test
        @DisplayName("should be an instceof Viedo class")
        void  build(){
        assertTrue(mediaBuilder.build() .get() instanceof Video);
        }


        @Test
        @DisplayName("title should be 'test'")
    void titleAttributeTest(){
            Media video = mediaBuilder.build().get();
            assertEquals( "test", video.getTitle());
        }

        @Test
        @DisplayName("should have correct atribute values")
    void atributeTest() {
        Media video = mediaBuilder.build().get();
        Float duration = 5.35F;
        assertAll(
                () -> assertEquals("test",video.getTitle()),
                () -> assertEquals("joli test de builder", video.getSummary()),
                () -> assertEquals(duration,video.getDuration()),
                () ->assertTrue(video.getAuthor() instanceof  Author)
        );
        }
}
package fr.aelion.repositories.course;

import fr.aelion.models.course.Media;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private Set<Media> media =new HashSet<>();
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Media> getMedia() {
        return media;
    }

    public  void  addMedia(Media media){
        this.media.add((media));
    }
    public  void  removeMedia(Media media){
        this.media.remove(media);
    }
}

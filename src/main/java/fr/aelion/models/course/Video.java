package fr.aelion.models.course;

public class Video extends Media {
    @Override
    public void play() {
        System.out.println("je vais lire une vidéo");
    }
}

package fr.aelion.helpers.factory;

import fr.aelion.models.course.Document;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;

import java.util.HashMap;
// Cette classe créer les instances a notre place et est reliée au builder
public class MediaFactory {
    private HashMap<String, Media> mediaTypes = new HashMap<>();
private  final static  String classRoot  = "fr.aelion.models.course";
    public  MediaFactory() {
        mediaTypes.put("VIDEO", new Video());
        mediaTypes.put("SLIDE", new Slide());
        mediaTypes.put("DOCUMENT", new Document());
    }
    /* Ces 2 suivantes  remplace les 3 d'en dessous

     */
    public Media getMedia(String mediaType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = mediaType.toLowerCase();
        className = String.valueOf(mediaType.charAt(0)).toUpperCase() + className.substring(1);
        return getInstance(className);
    }

    private Media getInstance(String mediaType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = MediaFactory.classRoot + "." + mediaType;
        return (Media) Class.forName(className).newInstance();
    }

  /*  private  Video getVideoInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String  className = MediaFactory.classRoot + ".Video";//fr.aelion.models.course.Video
            return (Video) Class.forName(className).newInstance();
        }
        private Slide getSlideInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
            String  className = MediaFactory.classRoot + ".Slide";
            return (Slide) Class.forName(className).newInstance();
        }
        private  Document getDocumentInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
            String  className = MediaFactory.classRoot + ".Document";
            return (Document) Class.forName(className).newInstance();
        }*/
    }




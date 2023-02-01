package com.freestack.helloworld.youtube.apis;

import com.freestack.helloworld.youtube.exceptions.ForbiddenException;
import com.freestack.helloworld.youtube.models.User;
import com.freestack.helloworld.youtube.models.Video;
import java.util.ArrayList;
import java.util.List;

public class VideoApi {

    public static List<Video> getVideos() {
        return videos;
    }

    private static List<Video> videos = new ArrayList<>();


    public static void upload(User userlogged, Video video) {
        if(userlogged.canCreate()){
            videos.add(video);
            return;
        }
        throw new ForbiddenException("user not allowed to upload video");

    }

    public static List<Video> listVideoByCreator(User user) {
        List<Video> userVideos = new ArrayList<>();
        /*
         un bon usage ici est de renvoyer systematiquement une liste initialisée meme vide (ou une exception si nécessaire)
         plutot qu'un null, cela evite au développeur appelant votre code d'avoir à penser de vérifier si elle est
         instanciée avant de faire des opérations dessus (`if(response != null)`)
        */
        if(user.canCreate()) {
            for (Video video : videos) {
                if (video.getCreator().getUsername()
                        .equals(user.getUsername())) {
                    userVideos.add(video);
                }
            }
            return userVideos;
        }
        return userVideos;
    }

}

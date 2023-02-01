package com.freestack.helloworld.youtube.models;

public class Like {

    private User user;
    private Video video;

    public Like(User user,
                Video video) {
        this.user = user;
        this.video = video;
    }

    public User getUser() {
        return user;
    }

    public Like setUser(
            User user) {
        this.user = user;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public Like setVideo(
            Video video) {
        this.video = video;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Like{");
        sb.append("user=").append(user);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}

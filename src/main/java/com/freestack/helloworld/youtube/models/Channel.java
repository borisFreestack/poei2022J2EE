package com.freestack.helloworld.youtube.models;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String channelName;
    private User creator;
    private List<Video> videos = new ArrayList<>();
    private List<User> suscribers = new ArrayList<>();


    public Channel(String channelName,
                   User creator) {
        this.channelName = channelName;
        this.creator = creator;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(
            User creator) {
        this.creator = creator;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(
            List<Video> videos) {
        this.videos = videos;
    }

    public List<User> getSuscribers() {
        return suscribers;
    }

    public void setSuscribers(
            List<User> suscribers) {
        this.suscribers = suscribers;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Channel{");
        sb.append("channelName='").append(channelName).append('\'');
        sb.append(", creator=").append(creator);
        sb.append(", videos=").append(videos);
        sb.append(", suscribers=").append(suscribers);
        sb.append('}');
        return sb.toString();
    }
}

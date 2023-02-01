package com.freestack.helloworld.youtube.models;

import java.util.Date;
import java.util.Objects;

public class Video {

    private Integer duration;
    private String title;
    private Date creationDate;
    private User creator;
    private Category category;
    private String url;

    public Video(String title,
                 User creator) {
        this.title = title;
        this.creator = creator;
    }

    public Integer getDuration() {
        return duration;
    }

    public Video setDuration(Integer duration) {
        if(duration < 0) {
            this.duration = duration;
        }
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Video setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Video setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(
            User creator) {
        this.creator = creator;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(
            Category category) {
        this.category = category;
    }

    public boolean equals(Object otherObject){
        Video otherVideo = (Video) otherObject;
        return Objects.equals(title, otherVideo.getTitle());
    }

    public int hashCode(){
        return Objects.hash(title);
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Video{");
        sb.append("duration=").append(duration);
        sb.append(", title='").append(title).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append(", creator=").append(creator);
        sb.append('}');
        return sb.toString();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

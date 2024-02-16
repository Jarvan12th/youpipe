package com.jarvanlee.youpipe.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "videos")
public class Video {
    @Id
    private String id;
    private String title;
    private String description;
    private Date uploadDate;
    private String url;
    private VideoThumbnails thumbnails;
    private int duration;
    @DBRef
    private User uploader;
    private int viewCount;
    private int likes;
    private int dislikes;
    private List<VideoComment> comments;
    private List<String> tags;
    private String status;

    // Constructors, Getters, Setters
}

@Data
class VideoThumbnails {
    private String small;
    private String large;
}

@Data
class VideoComment {
    private String userId;
    private String comment;
    private Date date;
}


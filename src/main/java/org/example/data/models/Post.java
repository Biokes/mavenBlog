package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("Post")
public class Post{
    @Id
    private String id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
    private List<Comment> comments;
    private List<View> views;

}

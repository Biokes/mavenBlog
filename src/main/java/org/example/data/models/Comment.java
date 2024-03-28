package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Comment")
public class Comment{
    @Id
    private String id;
    private String commentBody;
    private User commenter;
}

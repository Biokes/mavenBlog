package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("User")
public class User{
    @Id
    private String id;
    private String userName;
    private String lastName;
    private String firstName;
    private String password;
    @DBRef
    private List<Post> posts;
}

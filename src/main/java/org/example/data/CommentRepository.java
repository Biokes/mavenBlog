package org.example.data;

import org.example.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CommentRepository extends MongoRepository<Comment, String>{

}

package org.example.data;

import org.example.data.models.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ViewRepository extends MongoRepository<View, String>{
}

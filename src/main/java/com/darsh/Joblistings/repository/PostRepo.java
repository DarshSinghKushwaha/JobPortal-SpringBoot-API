package com.darsh.Joblistings.repository;

import com.darsh.Joblistings.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {

}

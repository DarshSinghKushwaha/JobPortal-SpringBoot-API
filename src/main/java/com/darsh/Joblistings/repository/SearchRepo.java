package com.darsh.Joblistings.repository;

import com.darsh.Joblistings.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SearchRepo {
    List<Post> findByText(String text);
}

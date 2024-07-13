package com.taisdias.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.taisdias.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
  
}

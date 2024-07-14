package com.taisdias.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taisdias.workshopmongo.domain.Post;
import com.taisdias.workshopmongo.resources.util.URL;
import com.taisdias.workshopmongo.services.PostService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

  @Autowired
  private PostService service;

  @RequestMapping(value="/{id}", method=RequestMethod.GET)
  public ResponseEntity<Post> findById(@PathVariable String id) {
    Post post = service.findById(id);
    return ResponseEntity.ok().body(post);
  }

  @RequestMapping(value="/titlesearch", method=RequestMethod.GET)
  public ResponseEntity<List<Post>> findByTitle(@RequestParam(value="text", defaultValue = "") String text) {
    text = URL.decodeParam(text);
    List<Post> list = service.findByTtitle(text);
    return ResponseEntity.ok().body(list);
  }
}

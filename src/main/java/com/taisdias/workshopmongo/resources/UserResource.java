package com.taisdias.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taisdias.workshopmongo.domain.User;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value="/users")
public class UserResource {

  @RequestMapping(method=RequestMethod.GET)
  public ResponseEntity<List<User>> findAll() {
    User tais = new User("1", "Tais Dias", "tais@gmail.com");
    User maria = new User("2", "Maria Silva", "maria@gmail.com");

    List<User> list = new ArrayList<>();
    list.addAll(Arrays.asList(tais, maria));

    return ResponseEntity.ok().body(list);
  }
}

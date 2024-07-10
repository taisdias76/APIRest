package com.taisdias.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taisdias.workshopmongo.domain.User;
import com.taisdias.workshopmongo.dto.UserDTO;
import com.taisdias.workshopmongo.services.UserService;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value="/users")
public class UserResource {

  @Autowired
  private UserService service;

  @RequestMapping(method=RequestMethod.GET)
  public ResponseEntity<List<UserDTO>> findAll() {
    List<User> list = service.findAll();
    List<UserDTO> listDTO = list.stream().map(u -> new UserDTO(u)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDTO);
  }

  @RequestMapping(value="/{id}", method=RequestMethod.GET)
  public ResponseEntity<UserDTO> findById(@PathVariable String id) {
    User user = service.findById(id);
    return ResponseEntity.ok().body(new UserDTO(user));
  }

  @RequestMapping(method=RequestMethod.POST)
  public ResponseEntity<Void> insert(@RequestBody UserDTO userDTO) {
    User user = service.fromDTO(userDTO);
    user = service.insert(user);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();

    return ResponseEntity.created(uri).build();
  }
}

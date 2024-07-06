package com.taisdias.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taisdias.workshopmongo.domain.User;
import com.taisdias.workshopmongo.repository.UserRepository;
import com.taisdias.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public List<User> findAll(){
    return repository.findAll();
  }

  public User findById(String id) {
    Optional<User> user = repository.findById(id);
    return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
  }
}

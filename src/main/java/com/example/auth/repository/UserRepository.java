package com.example.auth.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.auth.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

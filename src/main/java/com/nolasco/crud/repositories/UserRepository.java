package com.nolasco.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nolasco.crud.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

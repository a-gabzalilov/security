package com.example.security.repo;

import com.example.security.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface Users_repository extends CrudRepository<Users, Long> {
}

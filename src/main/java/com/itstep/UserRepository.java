package com.itstep;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.itstep.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
public User findByUsername(String Username);
}

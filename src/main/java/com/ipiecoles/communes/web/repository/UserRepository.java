package com.ipiecoles.communes.web.repository;

import com.ipiecoles.communes.web.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @EntityGraph(attributePaths = "roles") //on appelle ceci que sur cette méthode
    User findByUserName(String username);
}
package com.example.demo.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token,Integer> {
    @Query("select t from Token t join User u on t.user.id = u.id where u.id = :userId and (t.expired = false or " +
            "t.revoked = false)")
    List<Token> findAllTokensByUser(Integer userId);

    Optional<Token> findByToken(String token);
}

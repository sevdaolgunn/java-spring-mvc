package com.kozadev.web.repository;

import com.kozadev.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club,Long> {
    Optional<Club> findByTitle(String url);
    @Query("select c from Club where c.title like concat('%', :query, '%')")
    List<Club> searchClubs(String query);
}

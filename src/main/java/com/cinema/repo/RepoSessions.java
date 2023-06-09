package com.cinema.repo;

import com.cinema.models.Sessions;
import com.cinema.models.enums.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoSessions extends JpaRepository<Sessions, Long> {
    List<Sessions> findAllByGenre(Genre genre);

    List<Sessions> findAllByNameContaining(String name);

    List<Sessions> findAllByYear(int year);
}

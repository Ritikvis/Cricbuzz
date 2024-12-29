package com.CricBuzz.cricbuss.Repository;

import com.CricBuzz.cricbuss.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
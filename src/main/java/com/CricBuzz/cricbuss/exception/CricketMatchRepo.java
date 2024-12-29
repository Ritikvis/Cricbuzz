package com.CricBuzz.cricbuss.exception;

import com.CricBuzz.cricbuss.model.CricketMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketMatchRepo extends JpaRepository<CricketMatch, Integer> {
}
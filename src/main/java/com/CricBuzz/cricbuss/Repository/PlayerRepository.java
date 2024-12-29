package com.CricBuzz.cricbuss.Repository;

import com.CricBuzz.cricbuss.model.Enum.Gender;
import com.CricBuzz.cricbuss.model.Enum.Speciality;
import com.CricBuzz.cricbuss.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    List<Player> findByGender(Gender gender);
//
//    @Query(value = "select * from player where gender=:g and speciality=:speciality", nativeQuery=true)
//    List<Player> findPlayerBasedOnGenderAndSpeciality(@Param("g") String g,
//                                                      @Param("speciality") String speciality);

    // JPQL
    @Query(value = "select p from Player p where p.gender=:g and p.speciality=:speciality")
    List<Player> findPlayerBasedOnGenderAndSpeciality(@Param("g") Gender g,
                                                      @Param("speciality") Speciality speciality);

    // pisitonal aruments
//    @Query("select * from player where gender=:?1 and speciality=?2")
//    List<Player> findPlayerBasedOnGenderAndSpeciality(@Param("g") String g,
//                                                      @Param("speciality") String speciality);
//}
}
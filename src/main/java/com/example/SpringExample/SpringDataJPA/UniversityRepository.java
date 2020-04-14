package com.example.SpringExample.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer>{

    University findByName(String name);

    @Modifying
    @Query("UPDATE University u SET u.name = :name WHERE u.id = :id")
    void updateName(@Param("id") int id,
                    @Param("name") String name);

}

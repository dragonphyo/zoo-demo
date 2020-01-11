package com.example.demozoo.repository;

import com.example.demozoo.domain.Cage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CageRepository extends JpaRepository<Cage,Integer> {
}

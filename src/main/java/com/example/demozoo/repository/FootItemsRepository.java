package com.example.demozoo.repository;

import com.example.demozoo.domain.FootItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootItemsRepository extends JpaRepository<FootItems,Integer> {
}

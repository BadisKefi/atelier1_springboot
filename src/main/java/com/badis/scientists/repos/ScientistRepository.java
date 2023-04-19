package com.badis.scientists.repos;

import com.badis.scientists.entities.Scientist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScientistRepository extends JpaRepository<Scientist,Long> {
}

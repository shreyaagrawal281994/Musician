package com.musicalband.repositories;


import com.musicalband.entities.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band, Long> {
}

package com.musicalband.repositories;

import com.musicalband.entities.MusicalBand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalBandRepository extends JpaRepository<MusicalBand, Long> {

}

package com.musicalband.services;


import com.musicalband.entities.Band;
import com.musicalband.entities.MusicalBand;
import com.musicalband.entities.Musician;
import com.musicalband.entities.Person;
import com.musicalband.repositories.BandRepository;
import com.musicalband.repositories.MusicalBandRepository;
import com.musicalband.repositories.MusicianRepository;
import com.musicalband.repositories.PersonRepository;
import lombok.Locked;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MusicalBandService {

    private final MusicalBandRepository musicalBandRepository;
    private final BandRepository bandRepository;
    private final MusicianRepository musicianRepository;
    private final PersonRepository personRepository;

    @Transactional
    public Person createPerson(Person person) {
        return personRepository.saveAndFlush(person);
    }

    @Transactional
    public Musician createMusician(Musician musician) {
        return musicianRepository.saveAndFlush(musician);
    }

    @Transactional
    public Band createBand(Band band) {
        return bandRepository.saveAndFlush(band);
    }

    @Transactional
    public MusicalBand createMusicalBand(MusicalBand musicalBand) {
        return musicalBandRepository.saveAndFlush(musicalBand);
    }

    @Transactional
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Transactional
    public List<Musician> getMusicians() {
        return musicianRepository.findAll();
    }

    @Transactional
    public List<Band> getBands() {
        return bandRepository.findAll();
    }

    @Transactional
    public List<MusicalBand> getMusicalBands() {
        return musicalBandRepository.findAll();
    }

    @Transactional
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    @Transactional
    public Optional<Musician> getMusicianById(Long id) {
        return musicianRepository.findById(id);
    }

    @Transactional
    public Optional<Band> getBandById(Long id) {
        return bandRepository.findById(id);
    }

    @Transactional
    public Optional<MusicalBand> getMusicalBandById(Long id) {
        return musicalBandRepository.findById(id);
    }
}

package com.musicalband.controllers;

import com.musicalband.entities.Band;
import com.musicalband.entities.MusicalBand;
import com.musicalband.entities.Musician;
import com.musicalband.entities.Person;
import com.musicalband.services.MusicalBandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/com/v1/musicalband")
public class MusicalBandController {
    
    private final MusicalBandService musicalBandService;

    @PostMapping(value = "/person")
    public Person createPerson(@RequestBody Person person) {
        return musicalBandService.createPerson(person);
    }

    @PostMapping(value = "/musician")
    public Musician createMusician(@RequestBody Musician musician) {
        return musicalBandService.createMusician(musician);
    }

    @PostMapping(value = "/band")
    public Band createBand(@RequestBody Band band) {
        return musicalBandService.createBand(band);
    }

    @PostMapping(value = "/musical-band")
    public MusicalBand createMusicalBand(@RequestBody MusicalBand musicalBand) {
        return musicalBandService.createMusicalBand(musicalBand);
    }

    @GetMapping(value = "/persons")
    public List<Person> getPersons() {
        return musicalBandService.getPersons();
    }

    @GetMapping(value = "/musicians")
    public List<Musician> getMusicians() {
        return musicalBandService.getMusicians();
    }

    @GetMapping(value = "/bands")
    public List<Band> getBands() {
        return musicalBandService.getBands();
    }

    @GetMapping(value = "/musical-bands")
    public List<MusicalBand> getMusicalBands() {
        return musicalBandService.getMusicalBands();
    }

    @GetMapping(value = "/person/{id}")
    public Person findByPersonId(@PathVariable(value = "id") Long id) {
        return musicalBandService.getPersonById(id).get();
    }


}

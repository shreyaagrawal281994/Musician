package com.musicalband.controllers;


import com.musicalband.entities.Band;
import com.musicalband.entities.MusicalBand;
import com.musicalband.entities.Musician;
import com.musicalband.entities.Person;
import com.musicalband.services.MusicalBandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/com/v1/musicalband")
public class MusicalBandController {
    
    private final MusicalBandService musicalBandService;
    
    @PostMapping(value = "/band")
    public Band createBand(@RequestBody Band band) {
        return musicalBandService.createBand(band);
    }

    @PostMapping(value = "/musical-band")
    public MusicalBand createMusicalBand(@RequestBody MusicalBand musicalBand) {
        return musicalBandService.createMusicalBand(musicalBand);
    }

    @PostMapping(value = "/musician")
    public Musician createMusician(@RequestBody Musician musician) {
        return musicalBandService.createMusician(musician);
    }

    @PostMapping(value = "/person")
    public Person createPerson(@RequestBody Person person) {
        return musicalBandService.createPerson(person);
    }

    @GetMapping(value = "/musicians")
    public List<Musician> getMusicians() {
        return musicalBandService.getMusicians();
    }


    @GetMapping(value = "/secured/musicians")
    public List<Musician> getSecuredMusicians() {
        return musicalBandService.getMusicians();
    }

}

package com.musicalband;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.Instant;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@EnableJpaAuditing
@EntityScan(value= "com.musicalband.entities")
@SpringBootApplication
@EqualsAndHashCode
public class MusicalBandApplication {

    public static void main(String args[]) {
        SpringApplication.run(MusicalBandApplication.class, args);
    }
}

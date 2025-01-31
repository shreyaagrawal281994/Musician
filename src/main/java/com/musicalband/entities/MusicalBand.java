package com.musicalband.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "musical_band")
@EntityListeners(AuditingEntityListener.class)
public class MusicalBand {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "musical_band_id")
    private Long id;

    @OneToMany(mappedBy = "musicalBand")
    private List<Band> bands;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

}

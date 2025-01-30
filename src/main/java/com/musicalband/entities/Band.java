package com.musicalband.entities;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Table(name = "band")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "band_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "band")
    private List<Musician> musicians;

    @ManyToOne
    @JoinColumn(name = "musical_band_id")
    private MusicalBand musicalBand;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

}

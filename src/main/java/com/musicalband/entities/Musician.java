package com.musicalband.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "musician")
@EntityListeners(AuditingEntityListener.class)
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "musician_id")
    private Long id;

    @OneToOne(optional = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;
}

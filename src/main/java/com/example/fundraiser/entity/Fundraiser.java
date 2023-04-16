package com.example.fundraiser.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fundraiserDb")
public  class Fundraiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "fundraiserId")
    int fundraiserId;
    @Column(name = "fundraiserName")
    String fundraiserName;
    @Column(name = "startDate")
    String startDate;
    @Column(name = "targatAmount")
    int targatAmount;
    @Column(name = "currentAmount")
    int currentAmount;
    @Column(name = "endDate")
    String endDate;


}

package com.example.fundraiser.repository;

import com.example.fundraiser.entity.Fundraiser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundraiserRepository extends JpaRepository<Fundraiser,Long> {
    // all crud database methods
}

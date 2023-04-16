package com.example.fundraiser.controller;

import com.example.fundraiser.entity.Fundraiser;
import com.example.fundraiser.exception.FundraiserNotFoundException;
import com.example.fundraiser.repository.FundraiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/FundraiserRepository")
public class FundraiserController {
    @Autowired
    private FundraiserRepository fundraiserRepository;

    @GetMapping
    public List<Fundraiser> getAllfundraiser(Fundraiser fundraiser) {
        return fundraiserRepository.findAll();
    }

    //code for create
    @PostMapping
    public Fundraiser createFundraiser(@RequestBody Fundraiser fundraiser) {
        return fundraiserRepository.save(fundraiser);
    }

    //code for update
    @PutMapping("{id}")
    public ResponseEntity<Fundraiser> updateFundraiser(@PathVariable long id, @RequestBody Fundraiser fundraiserDetails) {

    Fundraiser updateFundraiser = fundraiserRepository.findById(id)
            .orElseThrow(() -> new FundraiserNotFoundException("Fundraiser not found"));

    updateFundraiser.setFundraiserId(fundraiserDetails.getFundraiserId());
    updateFundraiser.setFundraiserName(fundraiserDetails.getFundraiserName());
    updateFundraiser.setCurrentAmount(fundraiserDetails.getCurrentAmount());
    updateFundraiser.setStartDate(fundraiserDetails.getStartDate());
    updateFundraiser.setEndDate(fundraiserDetails.getEndDate());
    updateFundraiser.setTargatAmount(fundraiserDetails.getTargatAmount());

    fundraiserRepository.save(updateFundraiser);
    return ResponseEntity.ok(updateFundraiser);
    }

    //code getting
    @GetMapping("{id}")
    public ResponseEntity<Fundraiser> getFundraiserById(@PathVariable long id){
        Fundraiser fundraiser = fundraiserRepository.findById(id)
                .orElseThrow(()->new FundraiserNotFoundException("Fundra not found"));

        return ResponseEntity.ok(fundraiser);
    }

    //code for deleting
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteFundraiser(long id){
        Fundraiser fundraiser = fundraiserRepository.findById(id)
                .orElseThrow(()->new FundraiserNotFoundException("Fundrasiser not found"));
        fundraiserRepository.delete(fundraiser);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

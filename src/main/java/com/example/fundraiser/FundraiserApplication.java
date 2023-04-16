package com.example.fundraiser;

import com.example.fundraiser.entity.Fundraiser;
import com.example.fundraiser.repository.FundraiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundraiserApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FundraiserApplication.class, args);
	}

	@Autowired
	private FundraiserRepository fundraiserRepository;
	@Override
	public void run(String... args) throws Exception {
		Fundraiser fundraiser = new Fundraiser();
		fundraiser.setFundraiserId(1233);
		fundraiser.setFundraiserName("moshiii");
		fundraiser.setStartDate("20/03/2023");
		fundraiser.setEndDate("30/05/2023");
		fundraiser.setCurrentAmount(100000);
		fundraiser.setTargatAmount(3000000);
		fundraiserRepository.save(fundraiser);

		Fundraiser fundraiser1= new Fundraiser();
		fundraiser.setFundraiserId(223);
		fundraiser.setFundraiserName("alex");
		fundraiser.setStartDate("12/5/2023");
		fundraiser.setTargatAmount(20000);
		fundraiser.setCurrentAmount(500000);
		fundraiser.setEndDate("13/6/2023");
		fundraiserRepository.save(fundraiser);

		Fundraiser fundraiser2= new Fundraiser();
		fundraiser.setFundraiserId(324);
		fundraiser.setFundraiserName("kulwa");
		fundraiser.setStartDate("12/9/2023");
		fundraiser.setTargatAmount(1030000);
		fundraiser.setCurrentAmount(900000);
		fundraiser.setEndDate("31/12/2023");
		fundraiserRepository.save(fundraiser);


	}
}

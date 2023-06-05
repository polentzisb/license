package com.polentzi.license.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.polentzi.license.models.License;
import com.polentzi.license.models.Person;
import com.polentzi.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }
	public List<License> allLicenses() {
        return licenseRepository.findAll();
    }
	 public License createLicense(License license) {
			return licenseRepository.save(license);
	}
	 public Optional<License> getLicense(Long id) {
			return licenseRepository.findById(id);
	}
	 
	 public License createLicense(License license, Person myOption, String myState ,Date myDate,int myNumber) {
			license.setPerson(myOption);
			license.setState(myState);
			license.setExpirationDate(myDate);
			license.setNumber(myNumber);
			return licenseRepository.save(license);
		}
		public int generateLicenseNumber() {
			License license = licenseRepository.findTopByOrderByNumberDesc();
			if(license == null)
				return 1;
			int largestNumber = license.getNumber();
			largestNumber++;
			return (largestNumber);
		}
}

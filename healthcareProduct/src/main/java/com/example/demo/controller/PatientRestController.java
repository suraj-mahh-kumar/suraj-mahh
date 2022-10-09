package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@RestController
public class PatientRestController {

	@Autowired
	private PatientRepository patientRepo;
	
	@GetMapping("/get")
	public List<Patient> getDetails() {
		List<Patient> patient = patientRepo.findAll();
		return patient;
	}
	@PostMapping("/post")
	public void saveDetails(@RequestBody Patient patient) {
		
		patientRepo.save(patient);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteDetails(@PathVariable("Patientid") Long Patientid) {
		
		patientRepo.deleteById(Patientid);
	}
}

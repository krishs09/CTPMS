package com.impact.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.impact.pms.model.Appointment;
import com.impact.pms.model.DemographicDetailRequest;
import com.impact.pms.model.DemographicDetails;
import com.impact.pms.model.UserPatient;
import com.impact.pms.service.DemographicDetailsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DemographicDetailController {

	@Autowired
	private DemographicDetailsService service;
	
	@PostMapping("/save")
	public ResponseEntity<DemographicDetails>  saveDemographicDetails( @RequestBody DemographicDetailRequest demographicDetails) {
		System.out.println("REQUEST: "+demographicDetails);
		DemographicDetails details =service.saveDmgDetail(demographicDetails);
		return new ResponseEntity<DemographicDetails>(details, HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public int  updateDemographicDetails( @RequestBody DemographicDetails demographicDetails) {
		System.out.println("Update REQUEST: "+demographicDetails.getAge()+" "+demographicDetails.getFirstName());
		int details =service.updateDmgDetail(demographicDetails);
		return details;
	}
	
	@GetMapping("/getDemographicDetail")
	public ResponseEntity<DemographicDetails> getPatientDemographicDetails(@RequestParam Long patientId){
		
		DemographicDetails details =service.getDmgDetail(patientId);
		System.out.println("DMG : "+details);
		return new ResponseEntity<DemographicDetails>(details, HttpStatus.OK);
	}
	
	@GetMapping("/getpatientById")
	public ResponseEntity<UserPatient> getPatientDetailsById(@RequestParam long patientId){
		
		UserPatient u =service.getPatientDetails(patientId);
		System.out.println(u.toString());
		return new ResponseEntity<UserPatient>(u,HttpStatus.OK);
	}
	
	@GetMapping(value="/allappointments")
	public List<Appointment> getAllAppointments(@RequestParam int physicianId) {
		//return this.service.getAllAppointments();
		return service.getAllAppointmentsL(physicianId);
	}
}
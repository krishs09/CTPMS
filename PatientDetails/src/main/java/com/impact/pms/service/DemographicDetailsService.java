package com.impact.pms.service;

import org.springframework.stereotype.Service;

import com.impact.pms.model.Appointment;
import com.impact.pms.model.DemographicDetailRequest;
import com.impact.pms.model.DemographicDetails;
import com.impact.pms.model.UserPatient;
import java.util.List;
@Service
public interface DemographicDetailsService {

	public DemographicDetails saveDmgDetail(DemographicDetailRequest request);
	public int updateDmgDetail(DemographicDetails request);
	public UserPatient getPatientDetails(Long id);
	public DemographicDetails getDmgDetail(Long patId);
	public List<Appointment> getAllAppointmentsL(int physicianId);
}

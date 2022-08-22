package com.impact.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.impact.pms.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	@Query(value="Select * from appointment_master where physician_id = :id",nativeQuery = true)
	public List<Appointment> findByPhysicianId(int id);
}

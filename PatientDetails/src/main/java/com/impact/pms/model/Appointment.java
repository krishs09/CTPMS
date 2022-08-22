package com.impact.pms.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="appointment_master")
public class Appointment {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private int
	 * appointment_id; private String meeting_title; private int patient_id; private
	 * LocalDate appointment_date; private int did_examination_happened; private
	 * String patient_name; private String gender; private String age;
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appoinment_id")
	private int appoinmentId;
	@Column(name="did_examination_happened")
	private int didExaminationhappened;
	@Column(name="appointment_date",nullable = false,updatable = false)
	private LocalDate appointmentDate;
	private String PhysicianName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	private	String startAppointmentTime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	private	String endAppointmentTime;
	private String name;
	
	private String reasonOfVisit;
	
	private String patientID;
	@Column(name="physician_id")
	private int physicianId;
}

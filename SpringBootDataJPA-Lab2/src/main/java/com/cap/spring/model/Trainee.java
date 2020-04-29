package com.cap.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TraineeDetails")
public class Trainee {

	@Id
	@Column(name = "TraineeId", length = 2)
	private int traineeId;

	@Column(name = "TraineeName", length = 25)
	private String traineeName;

	@Column(name = "TraineeDomain", length = 25)
	private String traineeDomain;

	@Column(name = "Traineelocation", length = 25)
	private String traineeLocation;

	public int getTraineeid() {
		return traineeId;
	}

	public void setTraineeid(int traineeid) {
		this.traineeId = traineeid;
	}

	public String getTraineename() {
		return traineeName;
	}

	public void setTraineename(String traineename) {
		this.traineeName = traineename;
	}

	public String getTraineedomain() {
		return traineeDomain;
	}

	public void setTraineedomain(String traineedomain) {
		this.traineeDomain = traineedomain;
	}

	public String getTraineelocation() {
		return traineeLocation;
	}

	public void setTraineelocation(String traineelocation) {
		this.traineeLocation = traineelocation;
	}

	public Trainee(int traineeid, String traineename, String traineedomain, String traineelocation) {
		super();
		this.traineeId = traineeid;
		this.traineeName = traineename;
		this.traineeDomain = traineedomain;
		this.traineeLocation = traineelocation;
	}

	public Trainee() {
		super();
	}

	@Override
	public String toString() {
		return "Trainee [traineeid=" + traineeId + ", traineename=" + traineeName + ", traineedomain=" + traineeDomain
				+ ", traineelocation=" + traineeLocation + "]";
	}

}

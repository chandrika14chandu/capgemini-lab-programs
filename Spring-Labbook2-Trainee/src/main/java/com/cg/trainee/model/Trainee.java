package com.cg.trainee.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trainee_tbl")
public class Trainee {
	@Id
	@Column(name="trainee_id")
	private int traineeId;
	
	@Column(name="trainee_name",length=15)
	private String traineeName;
	
	@Column(name="trainee_location",length=15)
	private String traineeLocation ;

	@Column(name="trainee_domain",length=15)
	private String traineeDomain ;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	
	
	
}

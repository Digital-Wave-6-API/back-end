package com.digitalwave.recrutatech.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="job")

public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private long id;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="job_level")
	private String jobLevel;
	
	@Column(name="job_description", length = 1500)
	private String jobDescription;
	
	@Column(name="job_status")
	private String jobStatus;
	
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "kaa_id")
  private KAA kaa;

  
  public Job() {}

	public Job(String jobTitle, String jobLevel, String jobDescription, String jobStatus, KAA kaa) {
		this.jobTitle = jobTitle;
		this.jobLevel = jobLevel;
		this.jobDescription = jobDescription;
		this.jobStatus = jobStatus;
		this.kaa = kaa;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	
	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

  public KAA getKAA() {
      return kaa;
  }

  public void setKAA(KAA kaa) {
      this.kaa = kaa;
  }

}

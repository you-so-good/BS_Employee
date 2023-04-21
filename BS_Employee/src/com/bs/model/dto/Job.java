package com.bs.model.dto;

import java.util.Objects;

public class Job {
	private String jobCode;
	private String jobName;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(String jobCode, String jobName) {
		super();
		this.jobCode = jobCode;
		this.jobName = jobName;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "Job [jobCode=" + jobCode + ", jobName=" + jobName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(jobCode, jobName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		return Objects.equals(jobCode, other.jobCode) && Objects.equals(jobName, other.jobName);
	}
	
}

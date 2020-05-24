package com.apjp.backend.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class TimeMasterEntity {
	@Column(name = "Id")
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 5, allocationSize = 100)
    @GeneratedValue(generator = "mySeqGen")
	private long id;

	@Column(name = "ActivityName")
	private String activityName;

	@Column(name = "Category")
	private String category;

	@Column(name = "FromTime")
	private Time fromTime;

	@Column(name = "ToTime")
	private Time toTime;

	@Column(name = "ActualFromTime")
	private Time actualFromTime;

	@Column(name = "ActualToTime")
	private Time actualToTime;

	@Column(name = "ActivityDate")
	private Date activityDate;

	@Column(name = "Description")
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Time getFromTime() {
		return fromTime;
	}

	public void setFromTime(Time fromTime) {
		this.fromTime = fromTime;
	}

	public Time getToTime() {
		return toTime;
	}

	public void setToTime(Time toTime) {
		this.toTime = toTime;
	}

	public Time getActualFromTime() {
		return actualFromTime;
	}

	public void setActualFromTime(Time actualFromTime) {
		this.actualFromTime = actualFromTime;
	}

	public Time getActualToTime() {
		return actualToTime;
	}

	public void setActualToTime(Time actualToTime) {
		this.actualToTime = actualToTime;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

package com.apjp.backend.pojoclass;

import java.sql.Date;
import java.sql.Time;

public class TimeMaster {

	private long id;
	private String activityName;

	private String category;

	private Time fromTime;

	private Time toTime;

	private Time actualFromTime;

	private Time actualToTime;

	private Date activityDate;

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

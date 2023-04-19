package com.badis.scientists.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Scientist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scientistId;
    private String scientistName;
    private Date scientistBirthDate;

    public Scientist() {
        super();
    }

    public Scientist(String scientistName, Date scientistBirthDate) {
        super();
        this.scientistName = scientistName;
        this.scientistBirthDate = scientistBirthDate;
    }

    public Long getScientistId() {
        return scientistId;
    }

    public void setScientistId(Long scientistId) {
        this.scientistId = scientistId;
    }

    public String getScientistName() {
        return scientistName;
    }

    public void setScientistName(String scientistName) {
        this.scientistName = scientistName;
    }

    public Date getScientistBirthDate() {
        return scientistBirthDate;
    }

    public void setScientistBirthDate(Date scientistBirthDate) {
        this.scientistBirthDate = scientistBirthDate;
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "scientistId=" + scientistId +
                ", scientistName='" + scientistName + '\'' +
                ", scientistBirthDate=" + scientistBirthDate +
                '}';
    }
}

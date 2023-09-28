package ynu.edu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private String couId;
    private String couName;
    private Integer couCredit;
    private Double couTime;


    public String getCouId() {
        return couId;
    }

    public void setCouId(String couId) {
        this.couId = couId;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }

    public Integer getCouCredit() {
        return couCredit;
    }

    public void setCouCredit(Integer couCredit) {
        this.couCredit = couCredit;
    }

    public Double getCouTime() {
        return couTime;
    }

    public void setCouTime(Double couTime) {
        this.couTime = couTime;
    }
}


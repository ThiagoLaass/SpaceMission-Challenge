package src;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class SpaceMission {

    public String missionName;
    public String missionDescription;
    private String missionStatus;
    private String missionType;
    private String missionDestination;
    private Time missionDuration;
    private Date missionStartDate;

    public SpaceMission(String missionName, String missionDescription, String missionStatus, String missionType,
            String missionDestination, Time missionDuration, Date missionStartDate) {

        this.missionName = missionName;
        this.missionDescription = missionDescription;
        this.missionStatus = missionStatus;
        this.missionType = missionType;
        this.missionDestination = missionDestination;
        this.missionDuration = missionDuration;
        this.missionStartDate = missionStartDate;
    }

    public String getMissionName() {
        return this.missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionDescription() {
        return this.missionDescription;
    }

    public void setMissionDescription(String missionDescription) {
        this.missionDescription = missionDescription;
    }

    public String getMissionStatus() {
        return this.missionStatus;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }

    public String getMissionType() {
        return this.missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getMissionDestination() {
        return this.missionDestination;
    }

    public void setMissionDestination(String missionDestination) {
        this.missionDestination = missionDestination;
    }

    public Time getMissionDuration() {
        return this.missionDuration;
    }

    public void setMissionDuration(Time missionDuration) {
        this.missionDuration = missionDuration;
    }

    public Date getMissionStartDate() {
        return this.missionStartDate;
    }

    public void setMissionStartDate(Date missionStartDate) {
        this.missionStartDate = missionStartDate;
    }

    
}

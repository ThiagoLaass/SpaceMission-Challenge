package src;

import java.sql.Date;
import java.sql.Time;

public class SpaceMission {

    public String missionName;
    public String missionDescription;
    private String missionStatus;
    private String missionType;
    private String missionDestination;
    private Time missionDuration;
    private Date missionStartDate;


    public SpaceMission(String missionName, String missionDescription, String missionStatus, String missionType, String missionDestination, Time missionDuration, Date missionStartDate) {
        this.missionName = missionName;
        this.missionDescription = missionDescription;
        this.missionStatus = missionStatus;
        this.missionType = missionType;
        this.missionDestination = missionDestination;
        this.missionDuration = missionDuration;
        this.missionStartDate = missionStartDate;
    }
}

package src;

import java.util.ArrayList;

public class Nasa {

    public ArrayList<SpaceMission> spaceMissions = new ArrayList<SpaceMission>();
    public ArrayList<CrewMember> crewMembers = new ArrayList<CrewMember>();

    public static void main(String[] args) {
        // Create a Captain object
        Captain captain = new Captain("John", 10000L, "Captain", 1L, false, "Command the crew");
        // Create a Biologist object
        Biologist biologist = new Biologist("Jane", 8000L, "Biologist", 2L, false, "Study the life forms");
        // Create a Medic object
        Medic medic = new Medic("Jack", 9000L, "Medic", 3L, false, "Treat the crew");
        // Create a Engineer object
        Engineer engineer = new Engineer("Jill", 7000L, "Engineer", 4L, false, "Maintain the ship");
        // Create a SpaceMission object
        SpaceMission mission = new SpaceMission();
        // Assign the tasks
        captain.assignTask("Command the crew", "Captain");
        biologist.assignTask("Study the life forms", "Biologist");
        medic.assignTask("Treat the crew", "Medic");
    }
    
}
package src;

import java.util.Scanner;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Nasa {
    private static Scanner scanner = new Scanner(System.in);
    public ArrayList<SpaceMission> spaceMissions = new ArrayList<SpaceMission>();
    public ArrayList<CrewMember> crewMembers = new ArrayList<CrewMember>();

    public static void main(String[] args) {
        // Create a Captain object
        Captain captain = new Captain("John", 10000L, "Captain", 0, false, "Command the crew");

        // Create a Biologist object
        Biologist biologist = new Biologist("Jane", 8000L, "Biologist", 1, false, "Study the life forms");

        // Create a Medic object
        Medic medic = new Medic("Jack", 9000L, "Medic", 2, false, "Treat the crew");

        // Create a Engineer object
        Engineer engineer = new Engineer("Jill", 7000L, "Engineer", 3, false, "Maintain the ship");

        // Create a SpaceMission object
        SpaceMission mission = new SpaceMission(null, null, null, null, null, null, null);

        // Assign the tasks
        captain.assignTask("Command the crew", "Captain");
        biologist.assignTask("Study the life forms", "Biologist");
        medic.assignTask("Treat the crew", "Medic");
    }

    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }
    
    public void getInfo() {
        
        System.out.println("Hey, please Inform the name of your SpaceMission: ");
        String missionName = scanner.nextLine();
        System.out.println("Please Inform the duration of your SpaceMission: (year, month, day, hour, minute, second) ");
        Time missionDuration = new Time(scanner.nextLong());
        System.out.println("Please Inform the day your SpaceMission will start: (year, month, day)");
        Date missionStartDate = new Date(scanner.nextLong());
        System.out.println("Please Inform the type of your SpaceMission: ");
        String missionType = scanner.nextLine();
        System.out.println("Please Inform the destination of your SpaceMission: ");
        String missionDestination = scanner.nextLine();
        System.out.println("Please Inform the description of your SpaceMission: ");
        String missionDescription = scanner.nextLine();

        spaceMissions.add(new SpaceMission(missionName, missionDescription, "In Progress", missionType, missionDestination, missionDuration, missionStartDate));

        System.out.println("Please Inform how many people and who will be part of your mission respectively, remember to inform the role of each one: ");
        Integer crewNumber = scanner.nextInt();

        for (int i = 0; i < crewNumber; i++) {
            System.out.println("Please Inform the name of the crew member: ");
            String name = scanner.nextLine();
            System.out.println("Please Inform the salary of the crew member: ");
            Long salary = scanner.nextLong();
            System.out.println("Please Inform the role of the crew member: ");
            String role = scanner.nextLine();
            System.out.println("Please Inform the ID of the crew member: ");
            int Id = scanner.nextInt();
            System.out.println("Please Inform if the crew member is busy: ");
            boolean isBusy = scanner.nextBoolean();
            System.out.println("Please Inform the current task of the crew member: ");
            String currentTask = scanner.nextLine();

            if (role.equals("Captain")) {
                crewMembers.add(new Captain(name, salary, role, Id, isBusy, currentTask));
            } else if (role.equals("Biologist")) {
                crewMembers.add(new Biologist(name, salary, role, Id, isBusy, currentTask));
            } else if (role.equals("Medic")) {
                crewMembers.add(new Medic(name, salary, role, Id, isBusy, currentTask));
            } else if (role.equals("Engineer")) {
                crewMembers.add(new Engineer(name, salary, role, Id, isBusy, currentTask));
            } else {
                System.out.println("Invalid role, please inform a valid role.");
            }
            
        }
        
    }
}
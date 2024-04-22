package src;

import java.util.Scanner;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Nasa {
    public static ArrayList<SpaceMission> spaceMissions = new ArrayList<SpaceMission>();
    public static ArrayList<CrewMember> crewMembers = new ArrayList<CrewMember>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        spaceMissions.add(new SpaceMission(missionName, missionDescription, "In Progress", missionType,
                missionDestination, missionDuration, missionStartDate));

        System.out.println("Please Inform how many people are in the crew: ");
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
        scanner.close();
    }

    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }

    public void getInfo() {

    }
}
package src;
public class Engineer extends CrewMember {

    public Engineer(String name, Long salary, String role, Long Id, boolean isBusy, String currentTask) {
        super(name, salary, role, Id, isBusy, currentTask);
    }

    @Override
    public void doTask() {

    }

    @Override
    public void finalizeTask() {

    }
    
    @Override
    public void assignTask(String task, String role) {

    }
}

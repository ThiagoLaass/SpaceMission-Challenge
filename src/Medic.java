package src;
public class Medic extends CrewMember {

    public Medic(String name, Long salary, String role, int Id, boolean isBusy, String currentTask) {
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



public abstract class CrewMember {
    public String name;
    protected Long salary;
    public String role;
    protected Long Id;
    public boolean isBusy;
    public String currentTask;

    public CrewMember(String name, Long salary, String role, Long Id, boolean isBusy, String currentTask) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.Id = Id;
        this.isBusy = isBusy;
        this.currentTask = currentTask;
    }
    
    public abstract void doTask();
    public abstract void finalizeTask();


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return this.salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }


}

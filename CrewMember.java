

public class CrewMember {
    public String name;
    private Long salary;
    public String role;
    private Long Id;

    public CrewMember(String name, Long salary, String role, Long Id) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.Id = Id;
    }

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

package sample.TR1;

public class Manager extends Employee{
    private String department;

    public Manager(String name,int id,double salary,String department){
        super(name, id, salary);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void intoro(){
        System.out.println("-------------------------------");
        System.out.println("Name: "+this.getName());
        System.out.println("Id: "+this.getId());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Department: "+this.department);
    }
}

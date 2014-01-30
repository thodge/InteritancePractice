package myInterface;

public class SalariedEmployee implements Employee {

    private double salary;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;

    SalariedEmployee(String firstName, String lastName, int employeeSSN,
            String hireDate, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(int employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

}

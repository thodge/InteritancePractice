package myAbstract;

public abstract class Employee {

    private double employeeSSN;
    private String hireDate;
    private int employeeID;
    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName, int employeeSSN,
            String hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;

    

    public double getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(double employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

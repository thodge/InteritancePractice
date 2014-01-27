

package myAbstract;


public class SalariedEmployee extends Employee{
    private int salaryPayRate;

    public SalariedEmployee(String firstName, String lastName, int employeeSSN, String hireDate) {
        super(firstName, lastName, employeeSSN, hireDate);
    }

    public int getSalaryPayRate() {
        return salaryPayRate;
    }

    public void setSalaryPayRate(int salaryPayRate) {
        this.salaryPayRate = salaryPayRate;
    }
    
    
    
}

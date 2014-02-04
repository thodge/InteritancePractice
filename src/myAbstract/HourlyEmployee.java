package myAbstract;

public class HourlyEmployee extends Employee {

    private int hourlyPayRate;

    public HourlyEmployee(String firstName, String lastName, int employeeSSN, String hireDate) {
        super();


    }

    public int getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(int hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

}

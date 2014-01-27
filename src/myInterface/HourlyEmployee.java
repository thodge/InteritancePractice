

package myInterface;


public class HourlyEmployee implements Employee{
    private int hourlyPayRate;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;
    


    public int getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(int hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
    
}

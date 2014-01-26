package myAbstract;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private int commisionRate;
    private int salaryPlusCommisionRate;

    public int getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(int commisionRate) {
        this.commisionRate = commisionRate;
    }

    public int getSalaryPlusCommisionRate(int commissionRate, int salaryRate) {
        salaryPlusCommisionRate = commissionRate + salaryRate;
        return salaryPlusCommisionRate;
    }

    public void setSalaryPlusCommisionRate(int salaryPlusCommisionRate) {
        this.salaryPlusCommisionRate = salaryPlusCommisionRate;
    }

}

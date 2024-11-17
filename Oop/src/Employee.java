public class Employee {
    public int baseSalary;
    private int hourlyRate;

    public  int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() *extraHours);
    }
    public  int calculateWage(){
        return calculateWage(0) ;
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cano not be zero or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return  baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can not be zero");
        this.hourlyRate = hourlyRate;
    }
}
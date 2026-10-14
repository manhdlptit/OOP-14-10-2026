package baiTapHN;

public class Developer extends Employee{
    String language;
    int overtimeHour;
    double overtimeRate;
    public Developer(String name, String birthYear, String address, String phone, int id, String department, double baseSalary, int startYear, String language, int overtimeHour, double overtimeRate){
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.language = language;
        this.overtimeRate = overtimeRate;
        this.overtimeHour = overtimeHour;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + (overtimeHour * overtimeRate);
    }
}

package baiTapHN;

public class Manage extends Employee{

    int teamSize;
    int bonusMember;
    public Manage(String name, String birthYear, String address, String phone, int id, String department, double baseSalary, int startYear, int teamSize, int bonusMember){
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.teamSize = teamSize;
        this.bonusMember = bonusMember;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + (teamSize * bonusMember);
    }

}

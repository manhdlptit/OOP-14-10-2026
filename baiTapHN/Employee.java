package baiTapHN;

public class Employee extends Person{
    int id;
    String department;
    double baseSalary;
    int startYear;

    public Employee(String name, String birthYear, String address, String phone, int id, String department, double baseSalary, int startYear){
        super(name, birthYear, address, phone);
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.startYear = startYear;
    }

    public double calculateSalary(){
        return baseSalary + (200000 * startYear);
    }

    public String getRole(){
        return department;
    }

    @Override
    public void showInfo(){
        System.out.println("Ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("Ngay sinh: "+ birthYear);
        System.out.println("Dia chi: "+ address);
        System.out.println("SDT: "+ phone);
        System.out.println("Vai tro/ phong ban: "+ getRole());
        System.out.println("Luong: "+ calculateSalary());
    }
}

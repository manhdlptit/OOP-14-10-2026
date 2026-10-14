package baiTapHN;

public class Person {
    String name;
    String birthYear;
    String address;
    String phone;
    int age;

    public Person(String name, String birthYear, String adress, String phone){
        this.name = name;
        this.birthYear = birthYear;
        this.address = adress;
        this.phone = phone;
    }

    public int getAge() {
        return this.age;
    }

    public void showInfo(){
        System.out.println("Ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("Ngay sinh: "+ birthYear);
        System.out.println("Dia chi: "+ address);
        System.out.println("SDT: "+ phone);
    }
}



package baiTapHN;

public class Main {
    public static void main( String[] args){
        Person[] p = new Person[] {
                new Employee("NV1", "18122007", "MPVTPT", "0182", 1, "Q", 1000.999, 2020),
                new Developer("NV2", "18122002", "MPVTPT", "0182", 2, "1", 1000.999, 2020, "python", 999, 1),
                new Manage("NV3", "18122007", "MPVTPT", "0182", 3, "Q", 1000.999, 2020, 18, 1)
        };

        double sum = 0;
        int dev = 0;
        int mng = 0;

        for (Person mn : p){
            System.out.println("---------------");
            mn.showInfo();
            System.out.println("---------------");
            if (mn instanceof Employee){
                sum += ((Employee) mn).calculateSalary();
            }
            if (mn instanceof Developer){
                dev ++;
            }
            if (mn instanceof Manage){
                mng ++;
            }
        }
        System.out.println("------------------");
        System.out.println("Tong luong: "+ sum);
        System.out.println("Tong developer: "+ dev);
        System.out.println("Tong Manager: "+ mng);
        System.out.println("------------------");
    }

}

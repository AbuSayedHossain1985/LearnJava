package basic1.JavaClass;

import java.sql.SQLOutput;

public class LearnCasting {


//    casting: converting data type

    static int number=21;
    double salary=5000.50;
    static double bonus= 20000.50;
    float rent=10000.50f;
    public static void main(String[]args){

        System.out.println(LearnCasting.number);
        LearnCasting Sa=new LearnCasting();
        Sa.salary=5000.50;
        System.out.println(Sa.salary);

        double number1=LearnCasting.number;
        System.out.println(LearnCasting.number);
        int newSalary=(int) Sa.salary;
        System.out.println(newSalary);
        LearnCasting bo= new LearnCasting();
        System.out.println(bonus);
        int newBonus=(int) bo.bonus;
        System.out.println(newBonus);
        double newRent=(double)Sa.rent;
        System.out.println(newRent);
        int mayRent=(int) Sa.rent;
        System.out.println(mayRent);


    }
}

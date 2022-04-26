package basic1.JavaClass;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class LearnDataType {

//    Data type

//    Primitive data type


//    byte
//    short
//    long
//    int
//    float
//    char
//    boolean

    byte number = 124;
    char pizzaSize = 'L';
    int totalSale= 12000;
    long annualSalary= 1234567890;
    float pizzaPrice= 12.50f;
    double totalOrder=333.333333;
    boolean pizzaAvailable= true;

//    Non-primitive data type
    String name ="Sayed";
//    Array
    public static void main(String[]args){
        int number= 33;
        String name= "Sayed";
        String address= "Brooklyn, NY";

        System.out.println(number);
        System.out.println(name);
        System.out.println(address);

        int num1=40;
        int num2=60;
        int total= num1+num2;
        System.out.println(total);

        System.out.print("A/C details of: ");
        System.out.println(name + "  ");


        double monthlySalary = 12000.500;
        double annualGrossSalary= monthlySalary*12;
        double annualNetSalary=annualGrossSalary - annualGrossSalary*.3;

        System.out.print("Monthly Salary   :");
        System.out.println(monthlySalary + "  ");

        System.out.print("Annual Gross Salary  :");
        System.out.println(annualGrossSalary + "   ");
        System.out.print("Annual Nel Salary   :");
        System.out.println(annualNetSalary + "    ");





    }
}

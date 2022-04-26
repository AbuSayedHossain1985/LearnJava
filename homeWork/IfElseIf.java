package basic1.homeWork;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[]args){

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your score to get the grade   :");
        double score= input.nextDouble();
        if(score>100) {
            System.out.println("Enter a valid score");
        }else if(score>=94 && score<=100){
            System.out.println("Excellent");
        } else if(score>=90 && score <=93) {
            System.out.println("Very Good");

        }else if(score>=85 && score<=89)  {
            System.out.println("Good");
        }else if(score>=80 && score<=84){
            System.out.println("Average");
        }else if(score>=70 && score<=79){
            System.out.println("Pass");
        }else if(score>=60 && score<=69){
            System.out.println("Poor");
        }else{
            System.out.println("Need to repeat this course");
        }
}



    }


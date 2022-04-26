package basic1.JavaClass;

public class LearnVariable {
    //vary able : value will change based on its need
    //variable is container which contains some value

    // Any variable is created inside a class but outside a method is called class level variable/global variable/global scope variable
    //  Global variables can be used inside or outside anywhere
    //  Global variables also be called instance variable; a variable we declare inside the class but outside the method is instance variable
    // A global variable without static keyword is global instance variable
    // A global variable with static keyword is global static variable
    //   A static variable must be called by its  class name in another class
    //  A non-static variable can not be called directly or by its name
    // To call a non-static variable  we need to create object
    //To call static variable from other class should be called by class name
    //To call instance variable from other class should be called by  creating object
    // An instance variable specially called or used with is the same class only.
    //Any variable is created in side of a method is called class local variable
    //    Local variables can only be called or used or declared in side the method
    // Other method of same class do not have the existence of local variables except the declared method.
    //   A local variable cannot be defined with "static" keyword.

    String MYName= "Sayed";
     int age = 37;
     String name;
    static String address="Brooklyn, NY";
     int number;

     static int salary= 5000;  //it's a  global static variable
     public String instructorName ="Mahmood";
    //String is a data type
    //name is a variable
    //= assignment operator
    //"Sayed" is string value


    //declare a variable

    String Name; // only declared a variable without assigning a value

    //Declare a variable and assign value

    String StudentName = "Sayed";

    public static void main(String[]args){

        int a =5;
        int b =6;
        int c = b;
        int d = b-c;
        int e= b*c;

        System.out.println(c );
        System.out.println(d);
        System.out.println(e);


        System.out.println(LearnVariable.salary);
        System.out.println(LearnVariable.salary);

        LearnVariable obj= new LearnVariable();

        System.out.println(obj.age);

//       Object is an instance of a class which represents the whole class

        LearnVariable in = new LearnVariable();
        obj.age=30;
        LearnVariable.salary=5000;
        System.out.println(LearnVariable.salary);
        System.out.println(obj.age);


        LearnVariable.salary=70000;
        System.out.println(LearnVariable.salary);
        salary=5000;
        System.out.println(salary);
    }
}


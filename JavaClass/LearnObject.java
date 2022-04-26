package basic1.JavaClass;

public class LearnObject {


    // Object is an instance of a class which represents the whole class

    //syntax of object:class name+ object name = new + constructor of  class();

    public static void main(String[]args){
     LearnVariable obj= new LearnVariable();

        System.out.println(obj.age);
        System.out.println(LearnVariable.salary);
        LearnVariable in= new LearnVariable();
        in.age=50;
        System.out.println(in.age);
    }
}

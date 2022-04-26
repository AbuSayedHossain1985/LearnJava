package basic1.JavaClass;

public class Test {

    public static void main(String[]args){

      LearnVariable.salary=7000;
        System.out.println(LearnVariable.salary);

        LearnVariable in=new LearnVariable();
        in.age=27;
        System.out.println(in.age);
        System.out.println(LearnVariable.address);

        LearnVariable name = new LearnVariable();
         name.name="Hossain";
        System.out.println(name.MYName);
        System.out.println(name.instructorName);
        System.out.println(name.name);
        System.out.println(in.name);
        System.out.println(in.age);
        System.out.println(LearnVariable.address);
        in.number=21;
        System.out.println(in.number);
        LearnAccessModifier lam=new LearnAccessModifier();
        lam.name="Sayed";
        System.out.println(lam.name);
        lam.address="Brooklyn,NY";
      System.out.println(lam.address);
      lam.phoneNumber="3472966900";
      System.out.println(lam.phoneNumber);
      lam.age=35;
      System.out.println(lam.age);





    }
}

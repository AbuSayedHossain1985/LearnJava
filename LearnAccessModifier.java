package basic1;

public class LearnAccessModifier {
	
    public String name="Sayed";
    String address= "Brooklyn, New York";   //Default access modifier
    private String PhoneNumber="3472966900";
	protected int age=35;
	
	
    
	
	
	public static void main(String[]args) {
		
		LearnAccessModifier lam = new LearnAccessModifier();
		

		System.out.println(lam.name);
	
		
		
		System.out.println (lam.address);
		
		
		System.out.println(lam.PhoneNumber);
		
		
		System.out.println(lam.age);
		
		
		
		
		
		
lam.display(); // call method by object name
		
	}
	
	
	
	 void display() {
		System.out.println("This is a Display");
	}
		
	}




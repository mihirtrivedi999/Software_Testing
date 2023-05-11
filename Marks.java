package todayswork;

public class Marks {
		
	public static void main(String[] args) {
		int marks = 5;
		
		if(marks>=75) 
		{
			System.out.println("Distinction");
			
		}
		
		else if((marks>=60) || (marks<=75))
		{
			System.out.println("First class");
		}
		
		else if((marks<=50) || (marks<=60))
		{
			System.out.println("Secoend Class");
		}
		else if((marks<=35) || (marks<=50))
		{
			System.out.println("Pass class");
		}
		else
		{
			System.out.println("fail");
		}
	}
}

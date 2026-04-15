package Day_1;

public class IntroductionToJava 
{

	public static void main(String[] args) 
	{
		 String n = IO.readln("Enter the value ");
	
		int y = Integer.parseInt(n);
		
		for(int i = 1; i<=10; i++)
		{
			IO.println(y + "*" + i + "=" + y * i);
		}
		

	}

}

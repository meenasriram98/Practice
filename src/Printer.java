
public class Printer {
	
	boolean flag=false;
	
	synchronized void PrintEven(int evenNumber)
	{
		if(!flag)
		{
			try {
				wait();
				}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Even number;" +evenNumber);
		flag=false;
		
		notify();
		
	}
	
	synchronized public void PrintOdd(int oddNumber)
	{
		if(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Odd number: " +oddNumber);
		flag=true;
		
		
		notify();
	}
	

}

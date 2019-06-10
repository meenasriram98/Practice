
public class OddThread extends Thread {

	int max_limit=20;
	Printer printer;
	
	public OddThread(int limit,Printer printer)
	{
		this.max_limit=limit;
		this.printer=printer;
	}
	
	public void run()
	{
		int oddNumber=1;
		
		while(oddNumber<=max_limit)
		{
			printer.PrintOdd(oddNumber);
			oddNumber+=2;
		}
		
	}
}


public class EvenThread extends Thread{
	
	int max_limit;
	Printer printer=new Printer();
	
	
	public EvenThread(int limit,Printer printer)
	{
		this.max_limit=limit;
		this.printer=printer;
	}
	
	public void run()
	{
		int evenNumber=2;
		
		while(evenNumber<=max_limit)
		{
			printer.PrintEven(evenNumber);
			evenNumber+=2;
		}
	}

}

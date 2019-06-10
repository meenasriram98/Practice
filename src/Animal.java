
public abstract class Animal implements IEating {

	public static String CATEGORY="domestic";
	private String name;
	
	protected abstract String getSound();
	
	Animal(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
}

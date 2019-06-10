import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MainClass {
	public static void main(String args[])
	{
//		Person person =new Person();
//		Goat goat=new Goat("goat");
//		
//		Field[] fields=person.getClass().getDeclaredFields();
//		
//		for(Field field:fields)
//		{
//			System.out.println(field.getName());
//		}
//		
//		Class cls=goat.getClass();
//		
//		Package pkg=cls.getPackage();
//		Class<?>[] goatInterfaces=cls.getInterfaces();
//		Constructor<?>[] constructor=cls.getConstructors();
//		
//		System.out.println(constructor.length);
//		System.out.println(cls);
//		System.out.println(cls.getSimpleName());
//		System.out.println(cls.getCanonicalName());
//		System.out.println(cls.getName());
//		int number=cls.getModifiers();
//		System.out.println(pkg);
		
		
		Printer printer = new Printer();
		
		EvenThread th1=new EvenThread(20,printer);
		th1.setName("even");
		OddThread th2=new OddThread(20,printer);
		th2.setName("odd");
		th1.start();
		th2.start();
		
		
		
}
}
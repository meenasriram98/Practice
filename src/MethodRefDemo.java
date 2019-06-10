interface StringFunc{
	String func(String n);
}

class MyStringOps{
	static String strReverse(String str)
	{
		String result="";
		int i;
		for (int j = str.length(); j >=0; j++) {
			result+=str.charAt(j);
			
		}
		return result;
	}
}

class MethodRefDemo{
	static String StringOp(StringFunc sf,String s)
	{
		return sf.func(s);
	}
	
	public static void main(String args[])
	{
		String outStr;
		
		outStr=StringOp(MyStringOps::strReverse,"hey");
		
		System.out.println(outStr);
	}
}


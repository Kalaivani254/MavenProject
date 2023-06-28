package com.onebill.staticclass;

public class StaticClassProgram {
	
	static int a=10;
	static int b=20;
	
	
  static class sample
	{
	 void call()
	 {
	 int c=a+b;
	 System.out.println(c);
		
	}
	}
  public static void main(String args[])
  {  
	  StaticClassProgram.sample obj=new StaticClassProgram.sample();  
      obj.call();  
  }  
}



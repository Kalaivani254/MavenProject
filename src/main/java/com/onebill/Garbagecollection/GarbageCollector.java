package com.onebill.Garbagecollection;

public class GarbageCollector {
	 public void finalize()
	 {
		 System.out.println("garbage collection");
		 
	 }
	 
	 public static void main(String args[])
	 
	 {  
	   GarbageCollector s1=new GarbageCollector();  
	   GarbageCollector s2=new GarbageCollector();   
	   GarbageCollector s3=new GarbageCollector();
	   GarbageCollector s4=new GarbageCollector();
	   GarbageCollector s5=new GarbageCollector();
	   new GarbageCollector();
	   s1=null;
	   s2=null;
	   System.gc();
	 }  
	  


}

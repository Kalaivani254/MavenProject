package com.onebill.NullpointerException;

public class HandlingNullPointerException {
	
public static void main(String[] args) {
		
		String a = null;
        
		try   { 
			
           if ("hi".equals(a))     
           {
                System.out.print("not a null"); 
           }
          else if("hello".equals(a))
           {
                System.out.print("null");   
           }
        } 
        catch(NullPointerException e)   { 
            System.out.print("Caught NullPointerException"); 
        } 
		
		

	}

}

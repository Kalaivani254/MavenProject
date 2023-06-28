package com.onebill.Multithread;

class A1 extends Thread {
	 public void run() {
			int i=0;
			while (i<5) {
				System.out.println("hi");
				i++;
			
		} 
	}
}

class B1 extends Thread {
  public void run() {
			int i=0;
			while (i<5) {
				System.out.println("hello");
				i++;
			}
	}
}

class C1 extends Thread {
	public void run() {
			int i=0;
			while (i<5) {
				System.out.println("welcome");
				i++;
			
		} 
	}
}

public class WithoutException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 t11 = new A1();
		B1 t21 = new B1();
		C1 t31 = new C1();
		t11.start();
		t21.start();
		t31.start();

	}

}

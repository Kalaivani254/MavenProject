package com.onebill.Multithread;

class A extends Thread {
	 public void run() {
		try {
			int i=0;
			while (i<5) {
				sleep(1000);
				System.out.println("hi");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

class B extends Thread {
   public void run() {
		try {
			int i=0;
			while (i<5) {
				sleep(2000);
				System.out.println("hello");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

class C extends Thread {
	public void run() {
		try {
			int i=0;
			while (i<5) {
				sleep(3000);
				System.out.println("welcome");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

public class Multithread {
	
	public static void main(String args[]) {
		A t1 = new A();
		B t2 = new B();
		C t3 = new C();
		t1.start();
		t2.start();
		t3.start();
	
	}

}

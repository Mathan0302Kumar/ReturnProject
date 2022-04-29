package org.ret;

public class AxisBank {
	
	int a= 10;

private void Fixed(int a,int b,int c) {
	
	int d=0;
	d=a+b+c;
	
	System.out.println("My value is :"+d);

}

public static void main(String[] args) {
	AxisBank nm = new AxisBank();
	nm.Fixed(40, 60, 30);
	System.out.println("My instance value is:"+nm.a);
	System.out.println(nm.a);
	
}

}

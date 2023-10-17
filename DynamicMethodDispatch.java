import java.io.*;
class A {
	void m1() {
		System.out.println("Inside A method m1");
    }
}
class B extends A {
	void m1() {
		System.out.println("Inside B method m1");
    }
}
class C extends A {
	void m1() {
		System.out.println("Inside C method m1");
    }
}
public class DynamicMethodDispatch {
	public static void main(String args[]) {
		A a=new A();
		B b=new B();
		C c=new C();
		A r;
		r=a;
		r.m1();
		r=b;
		r.m1();
		r=c;
		r.m1();
    }
}

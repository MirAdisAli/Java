class A{
	int a;
}

class B extends A{
	int b;
}

class C extends B{
	int c;
}

public class InheritanceVarDemo {
	static A getObject(int type) {
		switch(type) {
		case 0: return new A();
		case 1: return new B();
		case 2: return new C();
		default: return null;
		}
	}
	public static void main(String[] args) {
		var x = getObject(0);
		var y = getObject(1);
		var z = getObject(2);
		System.out.println(x.a);
		System.out.println(y.b);
		System.out.println(z.c);
	}
}

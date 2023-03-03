
class A {
	final void f() {
		System.out.println("This is a final method");
	}
}

class B extends A{
	void f () {
		System.out.println("Illegal!");
	}
}

final class A{
	
}

class B extends A{
	
}

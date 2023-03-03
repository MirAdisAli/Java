abstract class S{
	abstract void call ();
	
	void call2() {
		System.out.println("This is a concrete method");
	}
}

class T extends S{
	void call() {
		System.out.println("T's implementation of call");
	}
}

class AbstractDemo {
	public static void main(String args[]) {
		T t= new T();
		t.call();
		t.call2();
	}
}

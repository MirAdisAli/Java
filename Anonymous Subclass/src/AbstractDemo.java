abstract class S{
	
	abstract void call();
	
	void call2() {
		System.out.println("This is a concrete method");
	}
}

class AbstractDemo {
	public static void main(String args[]) {
		S s = new S() {
			void call() {
				System.out.println("Call method of an abstract class");
			}
		};
		s.call();
	}

}


public class RealInheritance {
	
	public static void main(String[] args) {
		BoxWeight weightBox = new BoxWeight();
		System.out.println(weightBox.weight);
		BoxWeight plainBox = weightBox; // assign BoxWeight reference to Box reference
		System.out.println(((Object) plainBox).volume()); // OK, volume() defined in Box
		// System.out.println(plainBox.weight); // Error, weight not defined in Box
		Box box = new Box(1); // OK
		// BoxWeight wbox = box; // Error, can't assign Box reference to BoxWeight

	}
}
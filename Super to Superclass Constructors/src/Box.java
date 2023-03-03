class Box {

}
class BoxWeightNew extends Box{
	  double weight;
	  
	  BoxWeightNew(BoxWeightNew ob){
	    super();
	    weight = ob.weight;
	 }
	  BoxWeightNew(double w,double h, double d, double m){
	    super();
	    weight=m;}
	  BoxWeightNew(){
	    super();//must be the Ist statement in constructor
	    weight = 1;}
	  BoxWeightNew(double len,double m){
	    super();
	    weight =m;}
	  void print(){
	    String depth = null;
		String height = null;
		String width = null;
		System.out.println("Box(" +width +", " +height +", "+depth+", "+weight + ")");
	}
}


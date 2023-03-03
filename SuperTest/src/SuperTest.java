public class SuperTest{
	
  public static void main(String[] args){
   BoxWeightNew box1 = new BoxWeightNew(10,20,15,34.3);
   BoxWeightNew box2 = new BoxWeightNew(2,3,4,0.076);
   BoxWeightNew box3 = new BoxWeightNew();
   BoxWeightNew cube = new BoxWeightNew(3,2);
   BoxWeightNew clone = new BoxWeightNew(box1);
   box1.print();
   box2.print();
   box3.print();
   cube.print();
   clone.print();  
   }
  }


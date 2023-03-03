class C{
	
  int i;
  void show(){
  }
}

class D extends C{
  int i; 
  
  D(int a, int b){
    super.i= a;
    i= b;  
    }
  void show(){
    System.out.println("i in superclass: " + super.i);
    System.out.println("i in subclass: " + i);
    super.show();
    }
  }
public class UseSuper{
 public static void main(String[] args){
   D subOb = new D(1,2);
   subOb.show(); 
   }
 }
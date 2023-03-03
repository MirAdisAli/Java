class Point{
	int x,y;
	
	Point(int x, int y){
		this.x= x;
		this.y= y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		Point p1= new Point(10, 20);
		System.out.println(p1);
	}

}

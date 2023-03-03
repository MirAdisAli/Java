import java.util.HashMap;
import java.util.Objects;

class Point{
	int x,y;
	Point(int x, int y){
		this.x= x;
		this.y= y;
	}
	public boolean equals(Object o) {
		if(o == this)return true;
		if(!(o instanceof Point)) {
			return false;
		}
		Point p= (Point) o;
		if (p.x == this.x && p.y == this.y)return true;
		return false;
	}
	public int hashCode() {
		return Objects.hash(x,y);
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		Point p1= new Point(10,20);
		Point p2= new Point(10,20);
		System.out.println(p1.equals(p2));
		System.out.println(p1 ==p2);
		HashMap m = new HashMap();
		m.put(p1,  "Hello");
		System.out.println(m.get(p2));
	}
	
	

}

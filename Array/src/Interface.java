interface Shape {
	public void calculatearea();
	public void calculateperimeter();
}
class Circle implements Shape{
	float r=12.5f;
	public void calculatearea() {
		double area=3.14*r*r;
		System.out.println(area);
		}
	public void calculateperimeter() {
		double perimeter=2*3.14*r;
		System.out.println(perimeter);
	}
		
}
class Rectangle implements Shape{
	double l=14,b=11;
	public void calculatearea() {
		double area=l*b;
		System.out.println(area);
		
	}
	public void calculateperimeter() {
		double perimeter=(l+b)*2;
		System.out.println(perimeter);
		
	}
}
class Triangle implements Shape{
	double b=10,h=7,a=8,c=9;
	public void calculatearea() {
		double area=0.5*b*h;
		System.out.println(area);
		
	}
	public void calculateperimeter() {
		double perimeter=a+b+c;
		System.out.println(perimeter);
		
	}
}
public class Interface {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.calculatearea();
		
		c.calculateperimeter();
		Rectangle r=new Rectangle();
		r.calculatearea();
		r.calculateperimeter();
		Triangle t=new Triangle();
		t.calculatearea();
		t.calculateperimeter();
		
	}

}

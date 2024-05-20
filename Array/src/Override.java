class Parent{
	public void display() {
		System.out.println("parent method");
		
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("child method");
	}
}
public class Override {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.display();
	    Parent p1=new Child();
	    p1.display();

	}

}

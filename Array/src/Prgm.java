abstract class Shap {
	public abstract void draw();

	public abstract void calculateArea();
}

class Circl extends Shap {
	public void draw() {
		System.out.println("draw round");
	}

	public void calculateArea() {
		double r = 12.6;
		double area = 3.14 * r * r;
		System.out.println(area);
	}
}

class Rect extends Shap {
	public void draw() {
		System.out.println("draw box");
	}

	public void calculateArea() {
		double l = 13, w = 8;
		double area = l * w;
		System.out.println(area);
	}
}

class Triang extends Shap {
	public void draw() {
		System.out.println("draw lines");
	}

	public void calculateArea() {
		double h = 7, b = 10;
		double area = 0.5 * h * b;
		System.out.println(area);
	}
}

public class Prgm {
	public static void main(String[] args) {
		Circl c = new Circl();
		c.draw();
		c.calculateArea();
		Rect r = new Rect();
		r.draw();
		r.calculateArea();
		Triang t = new Triang();
		t.draw();
		t.calculateArea();

	}

}




class Engine{
	int horsepower;
	String fueltype;
	public void start() {
		System.out.println("start the engine");
    }
	public void stop() {
		System.out.println("stop the engine");
		 
	}
}
class Car{
	private Engine e;
	private String fueltype;
	private int horsepower;
	public Car(String fueltype,int horsepower,Engine e) {
		this.fueltype=fueltype;
		this.horsepower=horsepower;
		this.e=e;
	}
	public void start() {
		System.out.println("start the car"+" "+fueltype+" "+horsepower);
		e.start();
    }
	public void stop() {
		System.out.println("stop the car");
		e.stop();
		 
	}
	
	
}
public class Prgm1 {

	public static void main(String[] args) {
		Engine e=new Engine();
		Car c=new Car("petrol",65,e);
		c.start();
		c.stop();
	}
	

}

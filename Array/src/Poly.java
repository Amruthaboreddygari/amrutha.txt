abstract class Animal{
	public abstract void makesound();
		
	}
	class Dog extends Animal{
		public void makesound() {
			System.out.println("bow,bow");
			
		}
		
	}
	class Cat extends Animal{
		public void makesound() {
			System.out.println("meow,meow");
		}
}
	class Cow extends Animal{
		public void makesound() {
			System.out.println("moo,moo");
		}
	}

public class Poly {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat(), new Cow() };
           for (Animal animal : animals) {
            animal.makesound();
//		Animal a=new Dog();
//		a.makesound();
//		Animal an=new Cat();
//		an.makesound();
//		Animal ai=new Cow();
//		ai.makesound();
		
	}
	}
}

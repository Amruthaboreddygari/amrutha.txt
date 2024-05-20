
public class Std {
	int id,age;
	String name;
	public Std(int id,int age,String name) {
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println(id+" "+name+" "+age);
	}
	public Std(int id,String name) {
		System.out.println(id+" "+name);
	}
    public static void main(String[] args) {
    	
		Std s=new Std(12,21,"amrutha");
		
		Std s1=new Std(12,"siri");
		
		

	}

}

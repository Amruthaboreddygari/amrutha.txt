class Employe {
    private int id;
    private String name;
    private double salary;

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setId(int id) {
        this.id = id;
        System.out.println(getId());
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(getName());
    }

    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println(getSalary());
    }
}

public class Emp {
    public static void main(String[] args) {
        
        Employe e = new Employe();
        e.setId(121);
        e.setName("Amrutha");
        e.setSalary(100000);
        
    }
}

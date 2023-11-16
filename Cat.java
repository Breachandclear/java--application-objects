
public class Cat {
	public String name;
	private double age;
	
	public Cat() {
		System.out.println("I am a cat, I was just born!");
	}
	
	public Cat(double age) {
		this.age = age;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public String get_name() {
		return name;
	}
	
	public double get_age() {
		return age;
	}
	
	public boolean equals(Cat obj2) {
		if (this.name == obj2.name && this.age == obj2.age)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "Cat name is: " + name + "with age: " + age;
	}

}



//1.the toString() and equals() are inherited from the "object" class by default

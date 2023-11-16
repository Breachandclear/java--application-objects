
public class Run_cats {

	public static void main(String[] args) {
		Cat my_first_cat = new Cat();
		my_first_cat.set_name("Bob");
		
		Cat my_second_cat = new Cat();
		my_second_cat.set_name("Steve");
		
		System.out.println(my_first_cat.toString());
		System.out.println(my_second_cat.toString());
		
		System.out.println(my_first_cat.equals(my_second_cat));
		
		System.out.println(my_first_cat.name);

	}

}




//equals is not checking variable values but is actually checking for reference equality
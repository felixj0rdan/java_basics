// TO DEMONSTARTE THE USE OF ENUM

// enum defined to store colors and its hex values
enum Colors{
	
	// colors
	RED("#fc0303"), GREEN("#28fc03"), BLUE("#0303fc");
	
	// to store hex values
	String hex;
	
	// enum in java can have constructors unlike c/c++
	// using this constructor we can fix hex values for each colors
	Colors(String hex){
		this.hex = hex;
	}
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// enum object to access specific color
		Colors color = Colors.GREEN;

		// to display the enum constant GREEN
		System.out.println("Color: "+color);
		System.out.println("Hex: "+color.hex);
		System.out.println("-----------");
		
		// enum can also be iterated
		for(Colors i: Colors.values())
			System.out.println(i+" "+i.hex);


	}

}

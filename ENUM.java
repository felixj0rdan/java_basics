
enum Colors{
	RED("#fc0303"), GREEN("#28fc03"), BLUE("#0303fc");
	String hex;
	Colors(String hex){
		this.hex = hex;
	}
}
enum Constants{
	PI(3.14159265), g(9.8), c(2.9979);
	double val;
	Constants(Double val){
		this.val = val;
	}
}
public class ENUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colors color = Colors.GREEN;
		Constants con = Constants.PI;
		System.out.println("Color: "+color);
		System.out.println("Hex: "+color.hex);
		System.out.println("-----------");
		System.out.println("Constant: "+con);
		System.out.println("Value: "+con.val);

	}

}


public class Item {
	public Item (String n, String c, double p) {
		name = n;
		console = c;
		price = p;
	}
	
	public String reName() {
		return name;
	}
	
	public String reConsole() {
		return console;
	}
	
	public double rePrice() {
		return price;
	}
	
	public String name = "";
	public String console = "";
	public double price = 0;
}

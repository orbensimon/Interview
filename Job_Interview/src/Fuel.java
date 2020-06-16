
public class Fuel {

	public String title = "Fuel: ";
	public String description = "";
	FuelLeft left;
	FuelRight right;
	public Fuel(int num)
	{
		checkFuelErrorType(num);
	}
	public void checkFuelErrorType(int num) {
		if(num == 12)
		{
			if(left == null)
				left = new FuelLeft();
			
			this.description = left.description;
			title += description;
				
		}
		else
		{
			if(right == null)
				right = new FuelRight();
			
			this.description = right.description;
			title += description;
			
		}
		
	}
	public String toString()
	{
		return String.format(title);
	}
}



public class Fuel {

	public StringBuffer title = new StringBuffer ("Fuel: ");
	public StringBuffer originalTitle = new StringBuffer("Fuel: ");
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
			title.append(description);
				
		}
		else
		{
			if(right == null)
				right = new FuelRight();
			
			this.description = right.description;
			title.append(description);
			
		}
		
	}
	public String toString()
	{
		return String.format(title.toString());
	}
}

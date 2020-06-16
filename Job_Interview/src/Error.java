
public class Error {

	public int code;
	public Rotator rotator;
	public Ins ins;
	public Fuel fuel;
	public String totalErrorsString = "";
	
	public Error(int num)
	{
		
		assignNewError(num);
		
	}
	public String getErrorsString()
	{
		if(rotator != null)
			totalErrorsString += rotator.toString() + "\n";
		if(fuel != null)
			totalErrorsString += fuel.toString() + "\n";
		if(ins != null)
			totalErrorsString += ins.toString() + "\n";
		return totalErrorsString;
			
	}

	public void assignNewError(int num)
	{
		if(num == 10 || num == 11)
		{
			if(rotator == null)
				rotator = new Rotator(num);
			else
			{
				if(num == 10)
				{
					rotator.head = new HeadRotator();
					rotator.checkRotatorErrorType(num);
				}
				else
				{
					rotator.rear = new RearRotator();
					rotator.checkRotatorErrorType(num);
				}
			}
			
		}
		else if(num == 12 || num == 13)
		{
			if(fuel == null)
				fuel = new Fuel(num);
			else
			{
				if(num == 12)
				{
					fuel.left = new FuelLeft();
					fuel.checkFuelErrorType(num);
				}
				else
				{
					fuel.right = new FuelRight();
					fuel.checkFuelErrorType(num);
				}
			}
			
		}
		else if(num == 14)
			ins = new Ins();
		
	}
	public void delError(int num)
	{
		if(num == 10)
		{
			
			rotator.head = null;
			
			if(rotator.rear == null)
			{
				rotator = null;
				return;
			}
			rotator.title.delete(0,rotator.title.length());
			rotator.title.append(rotator.originalTitle).append(rotator.rear.description);
		
		}
		else if(num == 11)
		{
			
			rotator.rear = null;
			
			if(rotator.head == null)
			{
				rotator = null;
				return;
			}
			rotator.title.delete(0,rotator.title.length());
			rotator.title.append(rotator.originalTitle).append(rotator.head.description);
		}
		else if(num == 12)
		{
			fuel.left = null;
			
			if(fuel.right == null)
			{
				fuel = null;
				return;
			}
			fuel.title.delete(0,fuel.title.length());
			fuel.title.append(fuel.originalTitle).append(fuel.right.description);

		}
		else if(num == 13)
		{

			fuel.right = null;
			
			if(fuel.left == null)
			{
				fuel = null;
				return;
			}
			fuel.title.delete(0,fuel.title.length());
			fuel.title.append(fuel.originalTitle).append(fuel.left.description);

		}
		else if(num == 14)
			ins = null;
		
	}

}

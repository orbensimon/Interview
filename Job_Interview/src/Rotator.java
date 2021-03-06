

public class Rotator {

	public StringBuffer title = new StringBuffer ("Rotator: ");
	public StringBuffer originalTitle = new StringBuffer("Rotator: ");
	public String description = "";
	public HeadRotator head;
	public RearRotator rear;
	public Rotator(int num)
	{
		checkRotatorErrorType(num);
	}
	public void checkRotatorErrorType(int num) {
		if(num == 10)
		{
			if(head==null) 
				head = new HeadRotator();
			
			this.description = head.description;
			title.append(description);
		
		}
		else
		{
			if(rear == null)
				rear = new RearRotator();
			
			this.description = rear.description;
			title.append(description);
			
		}
		
	}
	public String toString()
	{
		
		return String.format(title.toString());
	}
}

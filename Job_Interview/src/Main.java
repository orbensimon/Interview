import java.util.ArrayList;

public class Main {
	public static ArrayList <Error> errorsArray = new ArrayList<Error>();
	public static Error error;
	public static void main(String args[])
	{
		insert(11);
		insert(10);
		insert(12);
		insert(13);
		insert(14);
		delete(14);
		delete(10);
		System.out.println(error.getErrorsString());
	}
	public static void insert(int num)
	{
		if(error == null)
			error = new Error(num);
		else
			error.assignNewError(num);
		
	}
	public static void delete(int num)
	{
		error.delError(num);
	}
}


public class myException extends Exception 
{
	myException()
	{
		super ("Something went wrong");
	}
	myException(String m)
	{
		super(m);
	}
}

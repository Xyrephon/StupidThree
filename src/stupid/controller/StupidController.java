package stupid.controller;

public class StupidController 
{
	private String myName;
	
	public StupidController()
	{
		myName = "Jonah Tucker";
	}
	
	public void start() 
	{
		System.out.println("This program is less stupid!");
		System.out.println("My name is " + myName);
	}
}

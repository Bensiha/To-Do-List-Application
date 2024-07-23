package todoapp;

public class Task {
	private String description;
	private boolean isDone;
	
	public Task(String description)
	{
		this.description = description;
		this.isDone = false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	public boolean isDone()
	{
		return isDone;
	}
	
	public void markAsDone() {
		// TODO Auto-generated method stub
		this.isDone = true;
	}
	

	public String toString()
	{
		if(isDone)
		{
			return "x" + description;
		}
		else
		{
			return " " + description;
		}
	}
	
	
}

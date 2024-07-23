package todoapp;
import java.util.List;
import java.util.ArrayList;

public class ToDoList {
	private List<Task> tasks;
	
	public ToDoList()
	{
		this.tasks = new ArrayList<>();
	}
	
	public void addTask(String description)
	{
		Task newTask = new Task(description);
		tasks.add(newTask);
		System.out.println("Added Task : "+description);
	}
	
	public void removeTask(int index)
	{
		if(index < 0 || index >= tasks.size())
		{
			System.out.println("Invalid task index");
		}
		else
		{
			Task removedTask = tasks.remove(index);
			System.out.println("Removed Task : "+removedTask.getDescription());
		}
	}
	
	public void markTaskAsDone(int index)
	{
		if(index < 0 || index >= tasks.size())
		{
			System.out.println("Invalid index");
		}
		else {
			Task task = tasks.get(index);
			task.markAsDone();
			System.out.println("Marked task as done : "+task.getDescription());
		}
	}
	
	public void displayTasks()
	{
		if(tasks.isEmpty())
		{
			System.out.println("The list is empty");
		}
		else
		{
			System.out.println("To-Do List : ");
			for(int i = 0 ;i < tasks.size() ; i++)
			{
				System.out.println((i+1)+"."+tasks.get(i));
			}
		}
	}

}

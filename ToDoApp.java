package todoapp;
import java.util.Scanner;
public class ToDoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList toDoList = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("To Do List Menu :");
			System.out.println("\n 1. Add Task");
			System.out.println("\n 2. Remove Task");
			System.out.println("\n 3. Mark Task as Done");
			System.out.println("\n 4. Display Tasks");
			System.out.println("\n 5. Exit");
			
			System.out.println("Enter the choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the task description : ");
				String description = scanner.nextLine();
				
				toDoList.addTask(description);
				break;
				
			case 2:
				System.out.println("Enter the task number : ");
				int removeIndex = scanner.nextInt() -1;
				toDoList.removeTask(removeIndex);
				break;
				
			case 3:
				System.out.println("Enter the task number to mark as done : ");
				int doneIndex = scanner.nextInt() - 1;
				toDoList.markTaskAsDone(doneIndex);
				break;
				
			case 4:
				System.out.println("Displaying the tasks....");
				toDoList.displayTasks();
				break;
				
			case 5:
				System.out.println("Exiting....");
				break;
				
			default:
				System.out.println("Enter a valid choice ");
			}
			
		}
		while(choice != 5);
		scanner.close();

	}

}

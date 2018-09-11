package view;

import java.util.Scanner;

import serviceImpl.QueuesServiceImpl;

public class view {
	public void menu() {
		System.out.println("WELCOME TO THE Queues");
		System.out.println("1. Press 1 to add the item.");
		System.out.println("2. Press 2 to remove the first item");
		System.out.println("3. Press 3 to get the first item");
		System.out.println("4. Press 4 to get all item");
		System.out.println("5. Press 5 to remove the item by name");
		System.out.println("6. Press 6 to exit");
	}
	public void controller(Scanner scan) {
		QueuesServiceImpl queues = new QueuesServiceImpl();
		while (true) {
			menu();
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the item");
				queues.offer( scan.next());
				System.out.println( " Inserted successfully.");
				System.out.println("\n-----------------------------------------------\n");
				break;
			case 2:
				String poll = queues.poll();
				if (poll != null) {
					System.out.println(poll + " has been removed");
				} else {
					System.out.println("Record not found");
				}

				System.out.println("\n-----------------------------------------------\n");
				break;
			case 3:
				String peek = queues.peek();
				if (peek != null) {
					System.out.println(peek);
				} else {
					System.out.println("Record not found.");
				}
				System.out.println("\n-----------------------------------------------\n");
				break;
			case 4:
				System.out.println("\n-----------------------------------------------\n");
				if(queues.getAll()!=null) {
					for (String ex : queues.getAll()) {
						System.out.println(ex);
					}
				}else {
					System.out.println("Record not found");
				}
				System.out.println("\n-----------------------------------------------\n");
				break;
			case 5:
				System.out.println("Enter the item");
				if(queues.remove(scan.next())) {
					System.out.println("Deleted successfully!!");
				}else {
					System.out.println("Record not found with this name");
				}
				System.out.println("\n-----------------------------------------------\n");
				break;
			case 6: 
				System.out.println("\n Application Terminated");
				scan.close();
				System.exit(0);
			default:
				System.out.println("\nApplication Terminated");
				scan.close();
				System.exit(0);

			}

		}
	}

}

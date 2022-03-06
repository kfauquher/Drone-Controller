//Author Name: Kylie Fauquher
//Date: 01/16/2022
//Program Name: Fauquher_Drone
//Purpose: Simulation using button, drone movement in x, y,z location


package sportdrone;

import java.util.Scanner;

public class Drone {

	public static void main(String[] args) {	
		
		//creating Drone display
		Drone d = new Drone();
		d.display();
		Scanner sc = new Scanner(System.in);
		
		int op;
		while(true) {
			
		//Drone Display menu	
		System.out.print("\n 1. Move Up \n 2. Move Down \n 3. Move Forward \n 4. Move Backward \n 5. Turn Left \n 6. Turn Right \n 7. Display Position \n 8. Exit Navigation");
		System.out.print("\n\nPlease Choose Menu Option 1-8: "); 
			op = sc.nextInt();
		
			switch(op) {
		
		//Drone Menu Options and Display Position
		case 1:
			d.moveUp();
			break;
			
		case 2:
			d.moveDown();
			break;
			
		case 3:
			d.moveForward();
			break;
			
		case 4:
			d.moveBackward();
			break;
			
		case 5:
			d.moveLeft();
			break;
			
		case 6:
			d.moveRight();
			break;
			
		case 7:
			d.display();
			break;
			
		case 8:
			System.out.println("\n----------Goodbye----------");
			return;
			default:
				System.out.println("\n----------Invalid! Please try again by using options 1-8----------");
		
		}
	}
}
	
	//The XYZ Directionals for the Drone. Used for the Display Position.
	private int x;
	private int y;
	private int z;
					
		
		public void display() {
			System.out.println("\n--------------------");
			System.out.println("Display Position");
			System.out.println("x= " + x);
			System.out.println("y= " + y);
			System.out.println("z= " + z);
			System.out.println("--------------------");
			
		}
		
		//This Moves the Drone and Properly Prints the Drone Direction
		public void moveUp() {
			z++;
			System.out.println("\n----------Drone #1 has Moved UP----------");
		}
		
		public void moveDown() {
			z--;
			System.out.println("\n----------Drone #1 has Moved DOWN----------");
		}
		
		public void moveForward() {
			x++;
			System.out.println("\n----------Drone #1 is Currently Facing NORTH----------");
		}
		
		public void moveBackward() {
			x--;
			System.out.println("\n----------Drone #1 is Currently Facing SOUTH----------");
		}
		
		public void moveLeft() {
			y++;
			System.out.println("\n----------Drone #1 is Currently Facing EAST----------");
		}
		
		public void moveRight() {
			y--;
			System.out.println("\n----------Drone #1 is Currently Facing WEST----------");
		}
		
		
		
		
	
	

}


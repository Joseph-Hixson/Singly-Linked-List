package singlyLinkedList;

import java.util.Arrays;

public class TestLinkedList {
	public static void main(String[] args) {
		StateLinkedList list = new StateLinkedList();
		
		// Add states;
		list.addState("California", Arrays.asList("Oregon", "Nevada", "Arizona"));
		list.addState("Texas", Arrays.asList("New Mexico", "Oklahoma", "Louisiana"));
		list.addState("Florida", Arrays.asList("Georgia", "Alabama"));
		
		//Print states
		list.printStates();
		
		//Delete a state
		list.deleteState("Texas");
		
		//Print states after deleting one
		System.out.println("\nList of states after the deletion Texas: ");
		list.printStates();
		
	}
}

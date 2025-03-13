package singlyLinkedList;

import java.util.List;

public class Node {
	String stateName;
	List<String> neighbors;
	Node next;
	
	//Constructor for Node class
	public Node(String stateName, List<String> neighbors) {
		this.stateName = stateName;
		this.neighbors = neighbors;
	}
}

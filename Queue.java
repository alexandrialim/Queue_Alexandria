/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue implements QueueInterface{
	private Node head;
	
	public Queue(){
		head = null;
	}

	public void enqueue(String record){
		Node newNode = new Node();
		newNode.record = record;
		if(head == null){
			head = newNode;
		}
		else{
			Node count = head;
			while(count.next != null){
				count = count.next;
			}
			count.next = newNode;
		}	
	}
	// Your implementation here
	
	public String dequeue() {
		String temp = head.record;
        head.record = null;
        head = head.next;
        return temp;
	}
	public void printQueue() {
		Node count = head;
		while( count != null){
			System.out.println(count.record);
			count = count.next;
		}
	}
	
}


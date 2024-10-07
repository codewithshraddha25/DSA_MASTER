package LinkedList;

public class LinkedList {

	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	public void printLL() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll= new LinkedList();
		ll.printLL();
		ll.addFirst(2);
		ll.printLL();
		ll.addFirst(1);
		ll.printLL();
		ll.addLast(3);
		ll.printLL();
		ll.addLast(4);
		ll.printLL();

	}

}

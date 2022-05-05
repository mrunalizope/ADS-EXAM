class Singlylinkedlist{
	static Node head;
	Node p=null;
static class Node{
	int data;
	Node next;
	Node (int d)
	{
		data=d;
		next=null;
	}}
	static Node reverselist(int data)
	{ 
	Node new_node=new Node(data);	
	if(head==null)
	{head=new_node;

	return head;
	}
	new_node.next=null;
	Node n=head;
	while(n.next!=null){
		n=n.next;
		
	}
	n.next=new_node;
	return head;
	}
	
	
	static void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+"--> ");
			n=n.next;
		}
		System.out.println("null");
	}
	
public static void main(String args[])
	{ //Node node;
		Singlylinkedlist l1=new Singlylinkedlist();
		reverselist rl=new reverselist();
		reverselist data(1);
		reverselist data(2);
		reverselist data(3);
		print();
		reverselist (head);
	
		
	}
}	
	
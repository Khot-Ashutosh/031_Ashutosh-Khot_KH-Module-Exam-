import java.util.*;
class LinkedList
{
	LinkedListNode head;
	static class LinkedListNode
	{
		int data;
		LinkedListNode next;
		LinkedListNode prev;
		
		LinkedListNode(int d)
		{
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}

	void addLast(int d)
	{
		
		LinkedListNode new_node = new LinkedListNode(d);
		if(head==null)
		{
			head = new_node;
			return;
		}
		LinkedListNode n = head;
		while(n.next!=null)
		{
			n = n.next;
		}
		n.next = new_node;
		new_node.prev = n;
	}
	
	void reverse(LinkedListNode n)
	{
		n = head;
		LinkedListNode p = null;
		while(n!=null)
		{
			p = n;
			n = n.next;
		}
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p = p.prev;
		}
	}

	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linkedlist");
		int t = sc.nextInt();
		System.out.println("Enter the elements of linkedlist");
		for(int i=0;i<t;i++)
		{
			int j = sc.nextInt();
			l1.addLast(j);
		}
		l1.reverse(l1.head);
		
	}
}
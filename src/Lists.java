import java.util.HashSet;

public class Lists {
	
	public void RemoveDuplicates(Node list)
	{
		HashSet<Integer> hashSet=new HashSet<Integer>();
		while(list!=null)
		{
			Node previous=null;
			if(hashSet.contains(list.data))
			{
				if(list.next==null)
				{
					previous.next=null;
					break;
				}
				previous.next=list.next;
			}
			else
			{
				hashSet.add(list.data);
				previous=list;
			}
			list=list.next;
		}
	}
	
	public void DeleteMiddleNode(Node node)

	{
//		Node slow=head;
//		Node fast=head;
//		
//		while(slow.next!=null)
//		{
//			if(fast.next.next!=null)
//			{
//				slow=slow.next;
//				fast=fast.next.next;
//			}
//			else
//			{
//				break;
//			}
//		}
		int data=node.next.data;
		node.data=data;
		node.next=node.next.next;
		
	}
	
	public Node ReverseList(Node node)
	{
		Node previous=null;
		Node temp=null;
		while(node.next!=null)
		{
			temp=node.next;
			node.next=previous;
			previous=node;
			node=node.next;
		}
		node.next=previous;
		return node;
	}
	
	public void add1(Node node)
	{
		int sum,remainder=0;
		Node head=ReverseList(node);
		Node temp=head;
		while(temp.next!=null)
		{
			sum=temp.data+1;
			if(sum>10)
			{
				temp.data=sum%10;
				remainder=sum/10;
			}
		}
		temp.data=temp.data+remainder;
		
		Node result=ReverseList(head);
	}

	
}


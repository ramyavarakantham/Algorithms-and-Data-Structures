
public class RemoveNthNodeFromEnd {
	//Definition for singly-linked list.
	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }

	
	    public static ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        ListNode voidNode=new ListNode(0);
	        voidNode.next=head;
	        int count=0;
	        ListNode i=voidNode, j=voidNode, prev=voidNode;
	        
	        while(j.next!=null)
	        {
	            j=j.next;//j=1
	            count++;//count=1
	            if(count==n)//true
	            {
	                prev=i;//prev=head
	                i=i.next;//i=1
	                count--;//count=0
	            }
	        }
	       
	        prev.next=i.next;//head.next=null
	        return voidNode.next;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		ListNode out=removeNthFromEnd(head, 2);
		while(out!=null)
		{
			System.out.println(out.val);
			out=out.next;
		}
			
		
		

	}

}

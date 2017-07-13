
public class CheckBalancedTreeLevels {
	public static class Node
	{
		int val;
		Node right=null, left=null;
		Node(int val)
		{
			this.val=val;
		}
	}
	public int getHeight(Node root)
	{
		if(root.left==null&&root.right==null)
			return 0;
		int left=0, right=0;
		if(root.left!=null)
			left=getHeight(root.left);
		if(root.right!=null)
			right=getHeight(root.right);
		return (left>=right)?left+1:right+1;
	}
	public boolean check(Node root)
	{
		if(root==null)
			throw new IllegalStateException("root is null, tree emtpy");
		if(root.left==null&&root.right==null)
			return true;
		int left=0, right=0;
		if(root.left!=null)
			left=getHeight(root.left);
		if(root.right!=null)
			right=getHeight(root.right);
		if(Math.abs(left-right)>1)
			return false;
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		//root.left.right=new Node(3);
		root.right=new Node(4);
		root.right.left=new Node(5);
		root.right.right=new Node(6);
		root.right.right.left=new Node(7);
		CheckBalancedTreeLevels c= new CheckBalancedTreeLevels();
		System.out.println(c.check(root));
		
	}

}

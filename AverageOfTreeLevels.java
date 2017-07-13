import java.util.LinkedList;
import java.util.Queue;

public class AverageOfTreeLevels {
	public static class TreeNode
	{
		int val;
		TreeNode left=null;
		TreeNode right=null;
		TreeNode(int val)
		{
			this.val=val;
		}
		
	}
	//Prints average of nodes at each level
	void levelOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root);
			int level=0;
			while(!q.isEmpty())
			{
				int qsize=q.size();
				int count=qsize;
				int sum=0;
				System.out.print("\nLevel "+level+": ");
				while(qsize!=0)
				{
					TreeNode temp=q.poll();
					System.out.print(temp.val+" ");
					sum+=temp.val;
					if(temp.left!=null)
						q.add(temp.left);					
					if(temp.right!=null)
						q.add(temp.right);
					qsize--;
				}
				System.out.println("\nAverage at Level "+level+" is: "+(double)sum/count);
				level++;
				
			}
		}
	}
	//Level order traversal by printing nodes of each level on a separate line
	/*void levelOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root);
			int level=0;
			while(!q.isEmpty())
			{
				int qsize=q.size();
				System.out.print("\nLevel "+level+": ");
				while(qsize!=0)
				{
					TreeNode temp=q.poll();
					System.out.print(temp.val+" ");
					if(temp.left!=null)
						q.add(temp.left);
					if(temp.right!=null)
						q.add(temp.right);
					qsize--;
				}
				level++;
			}
		}
	}*/
	//Level Order Traversal by printing nodes all at once
	/*void levelOrderTraversal(TreeNode root)
	{
		if(root!=null)
		{
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty())
			{
				TreeNode temp=q.poll();
				System.out.print(temp.val+" ");
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				
			}
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(-3);
		root.left.left=new TreeNode(4);
		AverageOfTreeLevels a=new AverageOfTreeLevels();
		a.levelOrderTraversal(root);
		

	}

}
/*
 * TestCases:
 * 1. Tree can be empty-if(root!=null)
 * 
 */


public class NumberOfNonLeaves {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		System.out.println("Number of NonLeaves="+numberofNonLeaves(tree.head));
		
	}
	
	public static int numberofNonLeaves(Node head) {
		if(head!=null) {
			if((head.right!=null||head.left!=null))
				return 1 + numberofNonLeaves(head.left) + numberofNonLeaves(head.right);
			
		}
		return 0;
	}

}

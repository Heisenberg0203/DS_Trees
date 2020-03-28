
public class NumberOfLeaves {
	int numberOfLeaves;
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		System.out.println("Number of Leaves="+numberofLeaves(tree.head));
		
	}
	
	public static int numberofLeaves(Node head) {
		if(head!=null) {
		if(head.right==null&&head.left==null)
			return 1;
		else 
			return numberofLeaves(head.left)+ numberofLeaves(head.right);
	}
		return 0;
	}
}

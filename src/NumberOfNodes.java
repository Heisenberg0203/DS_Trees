
public class NumberOfNodes {
	int numberOfNodes;
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		System.out.println("Number of Nodes="+numberofNodes(tree.head));
		
	}
	
	public static int numberofNodes(Node head) {
		if(head==null)
			return 0;
		else 
			return 1 + numberofNodes(head.left)+ numberofNodes(head.right);
	}

}

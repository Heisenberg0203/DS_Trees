
public class numberOfFullNodes {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		System.out.println("Number of FullNodes="+numberofFullNodes(tree.head));
		
	}
	
	public static int numberofFullNodes(Node head) {
		if(head!=null) {
			if((head.left!=null&&head.right!=null)) {
				return 1 +numberofFullNodes(head.left)+numberofFullNodes(head.right);
			}
		}
		return 0;
	}
	

}

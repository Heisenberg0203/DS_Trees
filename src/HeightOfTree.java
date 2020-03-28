import java.lang.Math;
public class HeightOfTree {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		System.out.println("Height of Tree="+heightOfTree(tree.head));
		
	}
	
	public static int heightOfTree(Node head) {
		if(head!=null) {
			if(head.left==null&&head.right==null)
				return 0;
			return 1 + Math.max(heightOfTree(head.left), heightOfTree(head.right));
		}	
		return 0;
	}
}

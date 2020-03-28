
public class Tree {
	Node head;
	
	public Tree() {
		
		Node one = new Node('a');
		Node two = new Node('b');
		Node three = new Node('c');
		Node four = new Node('d');
		Node five = new Node('e');
		Node six = new Node('f');
		Node seven = new Node('g');
		Node eight = new Node('h');
		Node nine = new Node('i');
		Node ten = new Node('j');
		Node el = new Node('k');
		
		one.left	 = two;
		one.right = three;
		two.left = four;
		two.right =five;
		three.left = six;
		three.right = seven;
		four.left=eight;
		four.right=nine;
		five.left=ten;
		six.right=el;
		
		head = one;
		
		
	}
	

}

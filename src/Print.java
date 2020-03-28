
public class Print {
public static void main(String[] args) {
	Tree tree = new Tree();
	Inorder(tree.head);
	System.out.println();
	Preorder(tree.head);
	System.out.println();
	Postorder(tree.head);
	
 }

public static void Inorder(Node head) {
		if(head!=null) {
			Inorder(head.left);
			System.out.print(head.data+" ");
			Inorder(head.right);
		}
	}

public static void Preorder(Node head) {
	if(head!=null) {
		System.out.print(head.data+" ");
		Preorder(head.left);
		Preorder(head.right);
	}
}
public static void Postorder(Node head) {
	if(head!=null) {
		Postorder(head.left);
		Postorder(head.right);
		System.out.print(head.data+" ");
	}
}

}

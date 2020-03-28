import java.util.Scanner;

public class BinaryTree {
	static Node head;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			char a = scan.next().charAt(0);
			if (a == '/')
				break;
			else {
				Node node = new Node(a);
				insertNode(head, node);
			}
		}
		Print.Inorder(head);
	}

	public static void insertNode(Node current, Node node) {
		//inserting head
		if (head == null) {
			head = node;
			return;
		} else {
			System.out.println(current.data + " " + node.data);
			if (node.data > current.data) {
				//right traversal, if null insert else go to right subtree
				if (current.right == null) {
					current.right = node;
					return;
				}

				insertNode(current.right, node);
			} else {
				//left traversal, if null insert else go to left subtree
				if (current.left == null) {
					current.left = node;
					return;
				}
				insertNode(current.left, node);
			}
		}
	}
}

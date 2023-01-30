package Other.Tree.BinaryTree;

public class Traverse {

	public void preOrder(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder(TreeNode node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void inOrder(TreeNode node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.val + " ");
		inOrder(node.right);
	}

	public static void main(String[] args) {
		Traverse obj = new Traverse();

		// [4,2,7,1,3,6,9]
		TreeNode root = new TreeNode(4,
				new TreeNode(2,
						new TreeNode(1), new TreeNode(3)),
				new TreeNode(7,
						new TreeNode(6), new TreeNode(9)));

		// pre : 4 2 1 3 7 6 9
		System.out.print("\n\npreOrder\n");
		obj.preOrder(root);

		// post : 1 3 2 6 9 7 4
		System.out.print("\n\npostOrder\n");
		obj.postOrder(root);

		// in : 1 2 3 4 6 7 9
		System.out.print("\n\ninOrder\n");
		obj.inOrder(root);
	}
}

class TreeNode {
	int val;
	TreeNode left, right;

	// TreeNode() {
	// }

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

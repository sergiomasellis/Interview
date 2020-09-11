/*
 * Create a Java Program to traverse a binary tree
 * using inorder traversal without recursion.
 * In PreOrder traversal first left nodes then right nodes to root.
 * and right node.
 *
 * input:
 *      40
 *     /  \
 *    20   50
 *   / \    \
 *  10  30   60
 * /   /  \
 * 5  67  78
 *
 * output: 40 20 10 5 30 67 78 50 60
 */

public class BinaryTree {

	public String outputString = "";


	public static class TreeNode {
		String data;
		TreeNode left, right;

		TreeNode(String value) {
			this.data = value;
			left = right = null;
		}

	}

	// root of binary tree
	TreeNode root;

	/**
	 * traverse the binary tree on preOrder traversal algorithm
	 */

	public void preOrder() {
		preOrder(root);
	}

	public void preOrder(TreeNode node) {
		if (node == null)
			return;

		if (node.data != null)
			outputString = outputString + node.data + " ";

		preOrder(node.left);
		preOrder(node.right);
	}


	/**
	 * Java method to create binary tree with interview.test data
	 *
	 * @return a sample binary tree for testing
	 */
	public static BinaryTree create() {
		BinaryTree tree = new BinaryTree();
		TreeNode root = new TreeNode("40");
		tree.root = root;
		tree.root.left = new TreeNode("20");
		tree.root.left.left = new TreeNode("10");
		tree.root.left.left.left = new TreeNode("5");

		tree.root.left.right = new TreeNode("30");
		tree.root.right = new TreeNode("50");
		tree.root.right.right = new TreeNode("60");
		tree.root.left.right.left = new TreeNode("67");
		tree.root.left.right.right = new TreeNode("78");

		return tree;
	}

}

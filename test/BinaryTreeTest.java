// import org.junit.Test;

// import static BinaryTree.TreeNode;
// import static org.junit.Assert.assertEquals;

// public class BinaryTreeTest {

// 	@Test
// 	public void TestPreOrder(){
// 		BinaryTree tree = new BinaryTree();

// 		TreeNode root = new TreeNode("40");
// 		tree.root = root;
// 		tree.root.left = new TreeNode("20");
// 		tree.root.left.left = new TreeNode("10");
// 		tree.root.left.left.left = new TreeNode("5");

// 		tree.root.left.right = new TreeNode("30");
// 		tree.root.right = new TreeNode("50");
// 		tree.root.right.right = new TreeNode("60");
// 		tree.root.left.right.left = new TreeNode("67");
// 		tree.root.left.right.right = new TreeNode("0");

// 		tree.preOrder();

// 		assertEquals("40 20 10 5 30 67 0 50 60 ", tree.outputString);
// 	}

// 	@Test
// 	public void TestPreOrderWithNullValue(){
// 		// Skip null tree values
// 		BinaryTree tree = new BinaryTree();
// 		TreeNode root = new TreeNode("30");

// 		tree.root = root;
// 		tree.root.left = new TreeNode("40");
// 		tree.root.left.left = new TreeNode("10");
// 		tree.root.left.left.left = new TreeNode(null);

// 		tree.root.left.right = new TreeNode("0");
// 		tree.root.right = new TreeNode("50");
// 		tree.root.right.right = new TreeNode("60");
// 		tree.root.left.right.left = new TreeNode("67");
// 		tree.root.left.right.right = new TreeNode("78");

// 		tree.preOrder();

// 		assertEquals("30 40 10 0 67 78 50 60 ", tree.outputString);
// 	}
// }

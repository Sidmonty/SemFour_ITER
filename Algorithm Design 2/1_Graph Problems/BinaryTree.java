// Recursive Java program for level
// order traversal of Binary Tree

// Class containing left and right child of current
// node and key value
class Node {
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	
	// Root of the Binary Tree
	Node root;

	public BinaryTree() { root = null; }

	// Function to print level order traversal of tree
	void printLevelOrder()
	{
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printCurrentLevel(root, i);
	}

	// Compute the "height" of a tree -- the number of
	// nodes along the longest path from the root node
	// down to the farthest leaf node.
	int height(Node root)
	{
		if (root == null)
			return 0;
		else {
			
			// Compute height of each subtree
			int lheight = height(root.left);
			int rheight = height(root.right);

			// use the larger one
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	// Print nodes at the current level
	void printCurrentLevel(Node root, int level)
	{
		if (root == null)
			return;
		if (level == 1){
			System.out.print(root.data + " "); n
		}
		else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}

	// Driver program to test above functions
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Level order traversal of"
						+ "binary tree is ");
		tree.printLevelOrder();
	}
}





































// [23/02, 7:22 am] Jagadeeswar Patro: https://www.geeksforgeeks.org/level-order-tree-traversal/
// [23/02, 7:26 am] Jagadeeswar Patro: https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
// [23/02, 7:27 am] Jagadeeswar Patro: https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/

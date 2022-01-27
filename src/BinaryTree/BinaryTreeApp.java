package BinaryTree;

/**
 *
 * @author BAP
 */
public class BinaryTreeApp{
        
  
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
   

        node = new TreeNode(25);
        tree.insert(node);

        node = new TreeNode(23);
        tree.insert(node);

        node = new TreeNode(24);
        tree.insert(node);
        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
        
    }
    }
    




package BinaryTree;

/**
 *
 * @author BAP
 */
public class BinaryTree {
    TreeNode root;

    public boolean isEmpty(){
        return (root==null);
    }

    //method insert data
    public void insert(TreeNode input) {
        if (isEmpty()) {
            root = input;
        } else {
            // cari parent yg sesuai dan (kiri/kanan)
            TreeNode current = root;
            TreeNode parent = null;
            boolean diKiri = true;
                while (current != null) {
                    parent = current;
                    // kalau data yang akan diinputkan lebih besar,
                    // bergerak ke kanan
                    if (current.nilai< input.nilai) {
                        current = current.right;
                        diKiri = false;
                    // else gerak ke kiri
                    } else if(current.nilai > input.nilai){
                        current = current.left;
                        diKiri = true;
                    }else{
                        System.out.println("nilai "+input.nilai+" sudah ada");
                        break;
                    }
                }
            // hubungkan ke parent
            if (diKiri) {
                parent.left = input;
            } else {
                parent.right = input;
            }
        }
    }
    public void preOrder(){
        preOrder(root);
    }
    public void inOrder(){
        inOrder(root);
    }
    public void postOrder(){
        postOrder(root);
    }
    
    public void preOrder(TreeNode akar){
 if(akar != null){
            System.out.print(akar.nilai+" ");
            preOrder(akar.left);
            preOrder(akar.right);
 }
    }
    public void inOrder(TreeNode akar){
 if(akar != null){
            inOrder(akar.left);
            System.out.print(akar.nilai+" ");
            inOrder(akar.right);
 }
    }

    public void postOrder(TreeNode akar){
 if(akar != null){
            postOrder(akar.left);
            postOrder(akar.right);
            System.out.print(akar.nilai+" ");
 }
    }

    //method mencari data
    public TreeNode search(int key) {
        TreeNode node = null;
        TreeNode current = root;
        // lakukan pencarian selama current bukan null
        while (current != null) {
            if (current.nilai == key) {
                return node;
            } else {
                if (current.nilai < key) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
        }
        return node;
    }
}
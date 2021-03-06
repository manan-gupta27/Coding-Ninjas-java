/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */


import java.util.ArrayList;

public class Solution {

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null){
            return root;
        }
        if(root.left==null && root.right ==null) {
			return null;
		}
        root.left = removeAllLeaves(root.left);
		root.right = removeAllLeaves(root.right);
        return root;
	}



}

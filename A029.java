package Algorithm3;

import java.util.Scanner;

public class A029 {
	 public static void main(String args[]) 
	    {
		   Scanner scanner = new Scanner(System.in);
		   int m = scanner.nextInt();
		   scanner.close();
	        BinaryTree tree = new BinaryTree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.left = new Node(8);
	        tree.root.right.right.right = new Node(9);
	        tree.printAncestors(tree.root, m);

	    }
}

 class Node{
     int data;
     Node left, right, nextRight;

     Node(int item) {
          data = item;
          left = right = nextRight = null;
       }
   }
class BinaryTree {
	 Node root;
	 boolean printAncestors(Node node, int target){
	      if (node == null)
	             return false;

	      if (node.data == target)
	             return true;
	     if (printAncestors(node.left, target)
	                 || printAncestors(node.right, target)){
	             System.out.print(node.data + " ");
	             return true;
	         }
	         return false;
	     }
}
package Algorithm3;

class TreeNode {  
    int val = 0;  
    TreeNode left = null;  
    TreeNode right = null;  
  
    public TreeNode(int val) {  
        this.val = val;  
    }  
}  
  
public class A034 {  
    static boolean isSymmetrical(TreeNode pRoot)  
    {  
        return isSymmetrical(pRoot,pRoot);  
    }  
    static boolean isSymmetrical(TreeNode pRootl,TreeNode pRootr){  
        if(pRootl==null && pRootr==null){  
            return true;  
        }  
        if(pRootl==null || pRootr==null){  
            return false;  
        }  
        if(pRootl.val!=pRootr.val){  
            return false;  
        }  
        return isSymmetrical(pRootl.left,pRootr.right) && isSymmetrical(pRootl.right,pRootr.left);  
    }
    
    public static void main(String[] args) {
    	A034 tree = new A034();
    	 TreeNode root = new TreeNode(1);  
    	 root.left = new TreeNode(2);  
         root.right = new TreeNode(3);  
         root.left.right = new TreeNode(6); 
         root.right.left = new TreeNode(5);
      boolean result = isSymmetrical(root);
      if(result = false) {
    	  System.out.println("no");
      }else {
    	  System.out.println("yes");
      }
    }
}  
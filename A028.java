package Algorithm3;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class A028 {  
    private int[] array= {10,5,20,9,3,2};
    private static List<Node> nodeList=null;
    
    private static class Node{
    	Node leftChild;
    	Node rightChild;
    	int data;
    	Node(int newData){
    		leftChild=null;
    		rightChild=null;
    		data = newData;
    	}
    }
    
    public void binTree() {
    	nodeList = new LinkedList<Node>();
    	for(int i=0;i<array.length;i++) {
    		nodeList.add(new Node(array[i]));
    	} //将数组的值一次转换为Node节点
    	for(int j=0;j<array.length/2-1;j++) {//对前个父节点与孩子节点的数字关系建立二叉树
    	nodeList.get(j).leftChild = nodeList.get(j*2+1);//左孩子
    	nodeList.get(j).rightChild=nodeList.get(j*2+2); //右孩子   	
    	}
    	int lastIndex = array.length/2-1;//最后一个父节点，因为最后一个父节点可能没有右孩子，所以单独处理
    	nodeList.get(lastIndex).leftChild = nodeList.get(lastIndex*2+1);
    	if(array.length % 2 ==1) {
    		nodeList.get(lastIndex).rightChild = nodeList.get(lastIndex*2+2); //当数组长度为技术时才建立右孩子
    	}	
    }
    
    	//中序遍历
    	public static void inOrder(Node node) {
    		if(node == null) return;
    		inOrder(node.leftChild);
    		System.out.print(node.data + " ");
    		inOrder(node.rightChild);
    	}
    	
        public static void main(String[] args) {
        	A028 bintree= new A028 ();
        	bintree.binTree();
        	Node root = nodeList.get(0);//第0个索引处的值即为根节点
             inOrder(root);
         	
        }
   }


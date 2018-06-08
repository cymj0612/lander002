package Algorithm3;

import java.util.Scanner;

public class A028_New {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//将字符用空格分开
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//将索引对应的字符赋值给整形数组
			}
	  BinTree bt = new BinTree();
	  for(int i=0;i<array.length;i++) {
		  bt.add(array[i]);
	  }
	  bt.print();
  }
}

 class BinTree{
	private Node root; //根节点
	public void add(int data) { //添加节点
		if(root==null) {
			root = new Node(data);
		}else {
			root.addNode(data);
		}
	}
	
	public void print(){  //输出节点
        if(root!=null){  
            root.print();  
        }  
    }  
	
	class Node{
		private int data; //当前节点数据
		private Node left;  //左子树
		private Node right;//右子树
		public Node(int data) {
			this.data=data;
		}
		//添加节点，this.data 表示，每一个的根节点，
		public void addNode(int data) {
			if(this.data>data) {
				if(this.left ==null) {
					this.left = new Node(data);
				}else {
					this.left.addNode(data);
				}
			}else if(this.data <= data) {
				if(this.right == null) {
					this.right = new Node(data);
				}else {
					this.right.addNode(data);
				}
			}
		}
		public void print() {
			if(this.left!=null) {
				this.left.print();
			}
			System.out.print(this.data + " ");
			if(this.right!=null) {
				this.right.print();
			}
		}
	}
}
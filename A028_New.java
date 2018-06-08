package Algorithm3;

import java.util.Scanner;

public class A028_New {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			scanner.close();
			String num[] = number.split(" ");//���ַ��ÿո�ֿ�
			int[] array = new int[num.length];
			for(int i=0;i<num.length;i++) {
				array[i] = Integer.parseInt(num[i]);//��������Ӧ���ַ���ֵ����������
			}
	  BinTree bt = new BinTree();
	  for(int i=0;i<array.length;i++) {
		  bt.add(array[i]);
	  }
	  bt.print();
  }
}

 class BinTree{
	private Node root; //���ڵ�
	public void add(int data) { //��ӽڵ�
		if(root==null) {
			root = new Node(data);
		}else {
			root.addNode(data);
		}
	}
	
	public void print(){  //����ڵ�
        if(root!=null){  
            root.print();  
        }  
    }  
	
	class Node{
		private int data; //��ǰ�ڵ�����
		private Node left;  //������
		private Node right;//������
		public Node(int data) {
			this.data=data;
		}
		//��ӽڵ㣬this.data ��ʾ��ÿһ���ĸ��ڵ㣬
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
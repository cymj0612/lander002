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
    	} //�������ֵһ��ת��ΪNode�ڵ�
    	for(int j=0;j<array.length/2-1;j++) {//��ǰ�����ڵ��뺢�ӽڵ�����ֹ�ϵ����������
    	nodeList.get(j).leftChild = nodeList.get(j*2+1);//����
    	nodeList.get(j).rightChild=nodeList.get(j*2+2); //�Һ���   	
    	}
    	int lastIndex = array.length/2-1;//���һ�����ڵ㣬��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե�������
    	nodeList.get(lastIndex).leftChild = nodeList.get(lastIndex*2+1);
    	if(array.length % 2 ==1) {
    		nodeList.get(lastIndex).rightChild = nodeList.get(lastIndex*2+2); //�����鳤��Ϊ����ʱ�Ž����Һ���
    	}	
    }
    
    	//�������
    	public static void inOrder(Node node) {
    		if(node == null) return;
    		inOrder(node.leftChild);
    		System.out.print(node.data + " ");
    		inOrder(node.rightChild);
    	}
    	
        public static void main(String[] args) {
        	A028 bintree= new A028 ();
        	bintree.binTree();
        	Node root = nodeList.get(0);//��0����������ֵ��Ϊ���ڵ�
             inOrder(root);
         	
        }
   }


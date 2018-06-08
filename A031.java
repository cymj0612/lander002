package Algorithm3;

import java.util.Map;
import java.util.TreeMap;

public class A031 {
      Node root;
      public void printBottom(Node node, int dist, int level,Map<Integer, Node> map){
      if(node == null)
        return;
       node.level = level;//��ÿ���ڵ㼶��ֵ
      //���map���������еĽڵ������map�еĸ��нڵ㼶��С�ڴ����ͬ�нڵ㼶�������
       if(!map.containsKey(dist) || map.get(dist).level < level)
         map.put(dist, node);
       printBottom(node.left, dist - 1, level + 1,map);
       printBottom(node.right, dist + 1, level + 1,map);
     }
     public static void main(String[] args) {
      A031 tree = new A031();
     Map<Integer, Node> map = new TreeMap<>();//TreeMap��֤��ӽ�ȥ��˳��
       // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.printBottom(tree.root, 0, 0, map);
        for (Node value : map.values()) {  
             System.out.print(value.data + " " );  
     }
   }
}

class Node {
    int data,level;
    Node left, right;
    Node(int item) {
      data = item;
      level = 0;//����ÿ���ڵ�ļ���
      left = right = null;  
  }
}

package Algorithm3;

import java.util.Map;
import java.util.TreeMap;
class Node {
 int data;
 Node left, right;

 Node(int item) {
  data = item;
  left = right = null;

 }
}

public class A038 {
 Node root;

 public void print(Node node, int dist, Map<Integer, Integer> map) {
  if (node == null)
   return;
  if (!map.containsKey(dist)){
   map.put(dist, node.data);
  }else {
   int sum = map.get(dist) + node.data;
   map.put(dist, sum);
  }

  print(node.left, dist - 1, map);
  print(node.right, dist, map);
 }

 public static void main(String[] args) {
  
  A038 tree = new A038();
  Map<Integer, Integer> map = new TreeMap<>();// TreeMap保证添加进去的顺序
  // Let us create trees shown in above diagram
  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);
  tree.root.right.left = new Node(5);
  tree.root.right.right = new Node(6);
  tree.root.right.left.left = new Node(7);
  tree.root.right.left.right = new Node(8);
  tree.print(tree.root, 0, map);
  for (Integer value : map.values()) {
   System.out.print(  value+ " ");
  }
  

 }
}
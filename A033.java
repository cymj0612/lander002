package Algorithm3;

	class Node {
		 int data;
		 Node left, right;

		 Node(int item) {
		  data = item;
		  left = right = null;
		 }
		}

		public class A033 {
		 public int max(int x, int y) {
		  return x > y ? x : y;
		 }

		 Node root;
		 int diameter;//������ֱ��
		 public int getDiameter(Node root) {
		  if (root == null)
		   return 0;
		  //�ֱ�������������ĸ߶�
		  int left_height = getDiameter(root.left);
		  int right_height = getDiameter(root.right);
		  //��ʾ���������߶ȼ�������ڵ�
		  int max_diameter = left_height + right_height + 1;
		  //�Ƚ��ϴε�ֱ������ε�ֱ�����������ֵ
		  diameter = max(diameter, max_diameter);
		  //���ظ߶�
		  return max(left_height, right_height) + 1;

		 }

		 public static void main(String[] args) {
		  A033 tree = new A033();
		  // Let us create trees shown in above diagram
		  tree.root = new Node(1);
		  tree.root.left = new Node(2);
		  tree.root.right = new Node(3);
		  tree.root.right.left = new Node(5);
		  tree.root.right.right = new Node(6);
		  tree.root.right.left.left = new Node(7);
		  tree.root.right.left.right = new Node(8);
		  tree.getDiameter(tree.root);
		  System.out.println(tree.diameter);
		  
		 }
	}

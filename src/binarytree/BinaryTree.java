package binarytree;

public class BinaryTree {

	private Node root;
	
	public BinaryTree(int x){
		root = new Node(x);
	}
	
	public BinaryTree(Node r){
		root = r;
	}
	
	public BinaryTree(BinaryTree t){
		root = new Node(t.root);
	}
	
	public int getLevelSum(int level){
		return root.getLevelSum(level, 0);
	}
	
	public static void main(String[] args) {
		Node n01 = new Node(1);
		
		Node n02 = new Node(1);
		Node n03 = new Node(1);
		
		Node n04 = new Node(1);
		Node n05 = new Node(1);
		Node n06 = new Node(1);
		Node n07 = new Node(1);
		
		n01.setLeft(n02);
		n01.setRight(n03);
		
		n02.setLeft(n04);
		n02.setRight(n05);
		
		n03.setLeft(n06);
		n03.setRight(n07);
		
		BinaryTree t = new BinaryTree(n01);
		
		System.out.println(t.getLevelSum(2));
	}
	
}

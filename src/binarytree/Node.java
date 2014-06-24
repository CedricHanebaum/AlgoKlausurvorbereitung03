package binarytree;

public class Node {

	private int element;
	private Node left, right;
	
	public Node(int element){
		this.element = element;
	}
	
	public Node(Node n){
		element = n.element;
		if(n.left != null) this.left = new Node(n.left);
		if(n.right != null) this.right = new Node(n.right);
	}
	
	public int getLevelSum(int level, int current){
		if(level == current) return 1;
		
		int r = 0, l = 0;
		if(left != null) l = left.getLevelSum(level, current + 1);
		if(right != null) r = right.getLevelSum(level, current + 1);
		
		return l + r;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	
	public Node getLeft(){
		return left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public int getElement(){
		return element;
	}
}

import java.lang.Comparable;

abstract class BinaryTree<T extends Comparable<T>> {

public class Node<T> 
{
	T value;
	Node<T> left;
	Node<T> right;

	public Node(T value)
	{
		this.value = value;
	}

	public Node(T value, Node<T> left, Node<T> right)
	{
		this.value = value;
		this.left = left;
		this.right = right;
	}
}


Node<T> first;

public void addNode(Node<T> first,Node<T> prev, T value)
{
	if (first == null) {
		if (prev.value.compareTo(value) > 0 )
			prev.left = new Node<T>(value);
		else prev.right = new Node<T>(value);
	}
	if (first.value.compareTo(value) > 0)
		addNode(first.left,first,  value);
	else if (first.value.compareTo(value) < 0)
		addNode(first.right,first, value);
}
public Node<T> contructTree(T[] preorder, T[] inorder, int in, int inEnd, int preindex)
{
	if (in > inEnd) return null;
	int inprev = in;

	Node<T> node = new Node<T>(preorder[preindex++]);
	
	if (in == inEnd) 
		return node;

	while (0 != inorder[in].compareTo(preorder[pre])) {	
		in++;
	}

	node.left = contructTree(preorder, inorder, inprev, --in, preindex);
	node.right = contructTree(preorder, inorder, ++in, inEnd, preindex);
}
}

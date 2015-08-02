abstract class Node {
	private Node[] children

	Node(Node[] children) {
		this.children = children
	}

	def int getNumChildren() {
		return children.length
	}

	def Node getChild(int index) {
		return children[index]
	}
}

class IntNode extends Node {
	private int value

	IntNode(Node[] children, int value){
		super(children)
		this.value = value
	}
}
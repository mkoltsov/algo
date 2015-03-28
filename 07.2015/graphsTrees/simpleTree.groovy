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

	def addChild(Node child) {
		children.add(child)
	}
}

def leafDescendant = new IntNode([], 10)
def leafDescendant1 = new IntNode([], 11)
def leafDescendant2 = new IntNode([], 12)
def leafDescendant3 = new IntNode([], 13)
def leafDescendant4 = new IntNode([], 14)
def leafDescendant5 = new IntNode([], 15)

def ancestorA = new IntNode()


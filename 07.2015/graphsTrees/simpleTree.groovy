abstract class Node {
	Node[] children

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
	def value

	IntNode(def children, def value){
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

def ancestorA = new IntNode([leafDescendant1, leafDescendant2, leafDescendant], 100)
def ancestorB = new IntNode([leafDescendant3, leafDescendant4], 200)

def rootNode = new IntNode([ancestorA, ancestorB, leafDescendant5], 1000)

def countTheValue(IntNode _) { 
	def cnt = 0 	
	//if (_.getNumChildren() > 0) {
			_.children.each {child ->
				countTheValue(child)
			}
		//cnt += countTheValue(child)
	//		}
		println("${_.value}")			
	}

	//return cnt 


println(countTheValue(rootNode))




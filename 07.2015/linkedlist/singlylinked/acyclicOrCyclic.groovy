class SinglyLinkedList<T> {
	ListElement<T> head
	ListElement<T> tail

	def enque(ListElement<T> newNode) {
		if (!head) {
			head = newNode
			tail = newNode
			} else {
				tail.next = newNode
				tail = newNode
			}
	}

	def iterateWithClosure(def clos) {
		def newHead = head

		while(newHead) {
			clos(newHead)
			newHead = newHead.next
		}
	} 

	def acyclicOrCyclic(){
		def symbolTable = []
		def newHead = head
		while(newHead) {
			if (newHead.next == null) {
				println("acyclic")
			}
				
			if (symbolTable.indexOf(newHead.value)<0) {
				symbolTable.add(newHead.value)
			} else {
				println("cyclic")
				return
			}
		
			newHead = newHead.next
		}
	}

	def deque (){
		head = head.next
	}

	def print() {
		def pr = {_ -> println(_.value)}
		iterateWithClosure(pr)
	}
}

	class ListElement<T> {
		ListElement<T> next
		T value
	}

	def list = new SinglyLinkedList<String>()

	def chef = new ListElement<String>(value:"Chef")
	def chef1 = new ListElement<String>(value:"Papa")
	def chef2 = new ListElement<String>(value:"Pupa")
	def chef3 = new ListElement<String>(value:"Bupa")
	def chef4 = new ListElement<String>(value:"Diop")
	def chef5 = new ListElement<String>(value:"Shmiot", next:chef)
	list.enque(chef)
	list.enque(chef1)
	list.enque(chef2)
	list.enque(chef3)
	list.enque(chef4)
	list.enque(chef5)
	list.acyclicOrCyclic()
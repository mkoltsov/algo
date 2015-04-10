class SinglyLinkedList<T> {
	ListElement<T> head
	ListElement<T> tail

	def enque(T value) {
		def newNode = new ListElement<T>(value:value)
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
			def clos = {_ -> 
				if (_.next == null) {
						println("acyclic")
					}}
			iterateWithClosure(clos)
		}

		def deque (){
			head = head.next
		}

		def print() {
			def pr = {_ -> println(_.value)}
			iterateWithClosure(pr)
		}

		class ListElement<T> {
			ListElement<T> next
			T value
		}
	}

	def list = new SinglyLinkedList<String>()

	list.enque("Chef")
	list.enque("Papa")
	list.enque("Pupa")
	list.enque("Bupa")
	list.enque("Diop")
	list.enque("Shmiot")
	list.print()

	list.deque()

	list.print()

	list.acyclicOrCyclic()
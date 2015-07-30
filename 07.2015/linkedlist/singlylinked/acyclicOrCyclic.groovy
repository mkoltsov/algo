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

		def acyclicOrCyclic(){

		}
		
		def deque (){
			head = head.next
		}

		def print() {
			def newHead = head

			while(newHead) {
				println(newHead.value)
				newHead = newHead.next
			}
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
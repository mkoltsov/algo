class DoublyLinkedList<T> {
	LinkedListElement<T> head
	LinkedListElement<T> tail
	def enque(T value){
		def newNode = new LinkedListElement<T>(value:value)
		if (!head) {
			head = newNode
			tail = newNode
			} else {
				tail.next = newNode
				def previous = tail
				tail = newNode
				tail.previous = previous
			}

		}

		def addChild(def child) {
			tail.child = child
		}

		private class LinkedListElement<T> {
			T value
			LinkedListElement<T> next
			LinkedListElement<T> previous
			LinkedListElement<T> child
		}
	}

	def list1 = new DoublyLinkedList<String>()

	list.enque("Chef")
	list.enque("Pupa")
	list.enque("Bupa")
	list.enque("Diop")
	list.enque("Diode")
	list.enque("Drew")
	list.enque("Stew")
	list.enque("Phew")

	def head = list.head

	while (head) {
		println(head.value)
		head = head.next
	}

	def tail = list.tail

	while (tail) {
		println(tail.value)
		tail = tail.previous
	}


	def list2 = new DoublyLinkedList<String>()

	list.enque("Chef1")
	list.enque("Pupa1")
	list.enque("Bupa1")
	list.enque("Diop1")
	list.enque("Diode1")
	list.enque("Drew1")
	list.enque("Stew1")
	list.enque("Phew1")

	list1.addChild(list2)


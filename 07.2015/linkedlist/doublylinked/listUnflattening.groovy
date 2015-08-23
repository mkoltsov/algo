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

		private class LinkedListElement<T> {
			T value
			LinkedListElement<T> next
			LinkedListElement<T> previous
			LinkedListElement<T> child
		}
	}

	def list = new DoublyLinkedList<String>()

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
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

		def flat(def list) {
			def head = list
			while (head) {
		//implement
				if (head.child) {
					head.child.previous.next = null
					head.child.previous = null
					flat(head.child)
				} 
				head = head.next
			}
		}

		def flatList() {
			def head = head

			while (head) {
				
				if (head.child) {
					head.child.previous.next = null
					head.child.previous = null
				}
				head = head.next
			}
		}

		def addChild(def child) {
			head.child = child.head
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

	def printFromHead = { _ ->
		def head = _.head

		while (head) {
			println(head.value)
			head = head.next
		}
	}

	printFromHead(list)

	def tail = list.tail

	while (tail) {
		println(tail.value)
		tail = tail.previous
	}

	def list2 = new DoublyLinkedList<String>()

	list2.enque("Chef1")
	list2.enque("Pupa1")
	list2.enque("Bupa1")
	list2.enque("Diop1")
	list2.enque("Diode1")
	list2.enque("Drew1")
	list2.enque("Stew1")
	list2.enque("Phew1")

	printFromHead(list2)

	list.addChild(list2)

	list.unFlat()
	println("after unflat")
	printFromHead(list)
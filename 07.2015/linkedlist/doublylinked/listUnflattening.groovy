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
			tail.child = child.head
		}

		def unFlat() {
			def head = head
			while (head) {
				if (head.child) {
					def previous = tail
					tail.next = head.child
					//need to investigate why does this code even work????
					tail = head.child.tail
					tail.previous = previous
				}				
				head = head.next
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

	def list3 = new DoublyLinkedList<String>()

	list3.enque("Chef12")
	list3.enque("Pupa12")
	list3.enque("Bupa12")
	list3.enque("Diop12")
	list3.enque("Diode12")
	list3.enque("Drew12")
	list3.enque("Stew12")
	list3.enque("Phew12")

	printFromHead(list2)

	list.addChild(list2)
	list2.addChild(list3)

	list.unFlat()
	println("after unflat")
	printFromHead(list)
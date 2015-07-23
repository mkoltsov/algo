class LinkedList<T> {
	def LinkedListElement<T> head
	def LinkedListElement<T> tail

	def enque(T value) {
		def newNode = new LinkedListElement<T>(value:value, next:null)
		if (!head) {
			head = newNode
			tail = newNode
			} else {
				tail.next = newNode
				tail = newNode
			}
		}

		def deque() {
			head = head.next
		}

		def findMthFromTail(int m) {
			def currHead = head
			def int cnt = 0
			def mThElement
			for (cnt; cnt<m; cnt++) {
				currHead = currHead.next
			} 

			mThElement = head
			while(currHead) {
				mThElement = mThElement.next
				currHead = currHead.next
			}

			if (cnt < m) {
				return "no such element"
				} else {
					return mThElement.value
				}

			}

			private class LinkedListElement<T> {
				T value
				LinkedListElement<T> next
			}
		}

		def list = new LinkedList<String>()

		list.enque("Chef")
		list.enque("Buba")
		list.enque("Pupa")
		list.enque("Diop")
		list.enque("Diode")
		list.enque("Diode1")
		list.enque("Diode2")
		list.enque("Diode3")
		list.enque("Diode4")
		list.enque("Diode5")
		list.enque("Diode6")
		list.enque("Diode7")
		list.enque("Diode84")
		list.enque("Diode9")
		list.enque("Drew")
	//list.deque()
	def mth = 11
	println("and the mth equal to ${mth} is ${list.findMthFromTail(mth)}")

	def head = list.head

	while(head) {
		println(head.value)
		head = head.next
	}
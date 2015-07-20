//import groovy.transform.Canonical
//@Canonical
class LinkedListList<T> {
	def LinkedListElement<T> head
	def LinkedListElement<T> tail

	def addNew(T value){
		def newNode  = new LinkedListElement<T>(value: value)
		if (!head) {
			head = newNode
			tail = newNode
			} else {
				tail.next = newNode
			}
			tail = newNode
			tail.next = null
		}

		def deleteHead(LinkedListElement deleted){

		}

		private class LinkedListElement<T> {
			def T value
			def LinkedListElement<T> next
		}
	}


	def list = new LinkedListList<String>()
	list.addNew("Chef")
	list.addNew("Chef2")
	list.addNew("Chef3")
	list.addNew("Chef4")
	list.addNew("Che5")
	list.addNew("Chef7")
	list.addNew("Chef9")
	list.addNew("Chef11")
	list.addNew("Chef12")

	def head = list.head
	while(head.next) {
		println(head.value)
		head = head.next
	}
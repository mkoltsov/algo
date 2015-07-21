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
		}

		def insertInFront(T value) {
			head  = new LinkedListElement<T>(value: value, next:head)
		}

		def deleteHead(){
			head = head.next
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

	list.deleteHead()
	list.deleteHead()
	list.deleteHead()
	list.deleteHead()
	list.deleteHead()

	list.insertInFront("Chef31337")
	list.insertInFront("Chef31338")
	list.insertInFront("Chef31339")
	list.insertInFront("Chef313310")
	list.insertInFront("Chef313311")
	list.insertInFront("Chef313312")

	def head = list.head
	while(head) {
		println(head.value)
		head = head.next
	}
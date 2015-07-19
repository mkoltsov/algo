//import groovy.transform.Canonical
//@Canonical
class LinkedListList<T> {
	def LinkedListElement<T> head
	def LinkedListElement<T> tail

	def addNew(T value){
		
		tail = new LinkedListElement<T>(value: value, next: null)
	}

	def deleteHead(LinkedListElement deleted){
		
	}

	private class LinkedListElement<T> {
		def T value
		def LinkedListElement<T> next
	}
}


def head = elem1

while(head) {
	println(head.value)
	head = head.next
}
//import groovy.transform.Canonical
//@Canonical
class LinkedListElement<T> {
	def LinkedListElement<T> head
	def LinkedListElement<T> tail
	def T value
	def LinkedListElement<T> next
}

def elem10 = new LinkedListElement<String>(value:"Last" )
def elem9 = new LinkedListElement<String>(value:"Chef8",next: elem10)
def elem8 = new LinkedListElement<String>(value:"Chef7",next:  elem9)
def elem7 = new LinkedListElement<String>(value:"Chef6",next: elem8)
def elem6 = new LinkedListElement<String>(value:"Chef5", next: elem7)
def elem5 = new LinkedListElement<String>(value:"Chef4",next:  elem6)
def elem4 = new LinkedListElement<String>(value:"Chef3",next:  elem5)
def elem3 = new LinkedListElement<String>(value:"Chef2",next:  elem4)
def elem2 = new LinkedListElement<String>(value:"Chef1",next:  elem3)
def elem1 = new LinkedListElement<String>(value:"Chef",next:  elem2)

def head = elem1

while(head) {
	println(head.value)
	head = head.next
}
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
list.enque("Drew")
list.deque()

def head = list.head

while(head) {
    println(head.value)
    head = head.next
}
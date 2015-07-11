import groovy.transform.Canonical
@Canonical
class ListElement<T> {
	private T value
	private ListElement<T> next
	def ListElement<T> insertInFront(ListElement<T> list, T data) {
		def l = new ListElement<T>(value:T)
		l.next = list
		return l
	}
}
//First approach
def ListEnd = new ListElement<String>(value:"Last")
def ListMiddle = new ListElement<String>(value:"Last", next:ListEnd)
def listStart = new ListElement<String>(value:"First", next:ListMiddle)

println(listStart.next.next.value)

//Tracking head approach
def start = new ListElement<String>(value:"First")
def head = start.insertInFront(new ListElement<String>(),"Second")
head.insertInFront(new ListElement<String>(),"Third")

println(head.value)
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

	def static findElement(ListElement<T> head, T data) {
		def elem = head
		while(elem && elem.value!=data) {
			elem = elem.next
		}

		return elem
	}
}
//First approach
def ListEnd = new ListElement<String>(value:"Last")
def ListMiddle10 = new ListElement<String>(value:"ListEnd", next:ListEnd)
def ListMiddle9 = new ListElement<String>(value:"ListMiddle10", next:ListMiddle10)
def ListMiddle8 = new ListElement<String>(value:"ListMiddle9", next:ListMiddle9)
def ListMiddle7 = new ListElement<String>(value:"ListMiddle8", next:ListMiddle8)
def ListMiddle6 = new ListElement<String>(value:"ListMiddle7", next:ListMiddle7)
def ListMiddle5 = new ListElement<String>(value:"ListMiddle6", next:ListMiddle6)
def ListMiddle4 = new ListElement<String>(value:"ListMiddle5", next:ListMiddle5)
def ListMiddle3 = new ListElement<String>(value:"ListMiddle4", next:ListMiddle4)
def ListMiddle2 = new ListElement<String>(value:"ListMiddle3", next:ListMiddle3)
def ListMiddle1 = new ListElement<String>(value:"ListMiddle2", next:ListMiddle2)
def ListMiddle = new ListElement<String>(value:"ListMiddle1", next:ListMiddle1)
def listStart = new ListElement<String>(value:"First", next:ListMiddle)

println(listStart.findElement(listStart, "ListEnd").value)
println(listStart.findElement(listStart, "Chef"))

println(listStart.next.next.value)

//Tracking head approach
def start = new ListElement<String>(value:"First")
def head = start.insertInFront(new ListElement<String>(),"Second")
head.insertInFront(new ListElement<String>(),"Third")

println(head.value)
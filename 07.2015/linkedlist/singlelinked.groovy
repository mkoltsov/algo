import groovy.transform.Canonical
@Canonical
class ListElement<T> {
	private T value
	private ListElement<T> next
}
def ListEnd = new ListElement<String>(value:"Last")
def ListMiddle = new ListElement<String>(value:"Last", next:ListEnd)
def listStart = new ListElement<String>(value:"First", next:ListMiddle)

println(listStart.next.next.value)
import groovy.transform.Canonical

class Stack<T> {
	def LinkedListElement<T> internalStack
		Stack() {
			internalStack = new LinkedListElement<T>()
		}

	def pop() {
		return internalStack.delete()
	}

	def push(T value) {
		return internalStack.insert(value)
	}

	def printMe() {
		internalStack.printStackTace()
	}
	@Canonical
	private class LinkedListElement<T> {
		def T value
		def LinkedListElement<T> next
		def private LinkedListElement<T> head

		def insert(T value) {
			this.next = this.head
			this.head = new LinkedListElement<T>(value:value)
		}

		def delete() {
			def val =  this.head.value
			this.head = this.head.next
			return val 
		}

		def printStackTace()	{
			def next = head
			while(next) {
				println(next.value)
				next = head.next
			}
		}
	}
}

def stack = new Stack<String>()

def f = stack.push("Chef")
def df = stack.push("Pupa")
def fd3 = stack.push("Bupa")
def fd4 = stack.push("Diop")
def fd5 = stack.push("GA")
def fd6 = stack.push("SF")
def fd7 = stack.push("PL")
def fd8 = stack.push("HU")
println(stack.internalStack.next.value)
println(stack.pop())
println(stack.pop())
//println(stack.pop())
//println(stack.pop())

println(stack.internalStack.next.value)

//stack.printMe()
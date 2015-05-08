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
			head = new LinkedListElement<T>(value:value, next:head)
		}

		def delete() {
			def val =  head.value
			head = head.next
			return val 
		}

		def printStackTace()	{
			def next = head
			println(next)
			while (next) {
				println(next.value)
				next = next.next
			}
		}
	}
}

def stack = new Stack<String>()

stack.push("Chef")
stack.push("Pupa")
stack.push("Bupa")
stack.push("Diop")
stack.push("GA")
stack.push("SF")
stack.push("PL")
stack.push("HU")

stack.printMe()
//println(stack.internalStack.next.value)
println(stack.pop())
println(stack.pop())
println(stack.pop())
println(stack.pop())
println(stack.pop())
println(stack.pop())
println(stack.pop())
println(stack.pop())
println(stack.pop())
//println(stack.pop())

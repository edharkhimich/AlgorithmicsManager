package queue

fun main() {

    val queue = StringQueue(10)
    queue.add("One")
    queue.add("Two")
    queue.add("Three")
    queue.add("Four")
    queue.add("Five")
    queue.add("Six")
    queue.add("Seven")
    queue.add("Eight")
    queue.add("Nine")
    queue.add("Ten")
    queue.add("Eleven")

    queue.print()

    println(queue.size())
    queue.remove()
    println(queue.size())
}
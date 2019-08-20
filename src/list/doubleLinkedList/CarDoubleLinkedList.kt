package list.doubleLinkedList

class CarDoubleLinkedList {

    private var head: CarNode? = null
    private var tail: CarNode? = null

    private var size: Int = 0

    fun addToFront(car: Car){
        val node = CarNode(car)
        node.next = head

        if(head == null) tail = node
        else head?.prev = node

        head = node
        size++
    }

    fun addToEnd(car: Car){
        val node = CarNode(car)

        if(tail == null) head = node
        else {
            tail?.next = node
            node.prev = tail
        }

        tail = node

        size++
    }

    fun removeFromFront(){
        if(head == null) return

        val newHead = head?.next

        if(head?.next == null) tail = null
        else head?.next?.prev = null

        head = newHead
        size--
    }

    fun removeFromEnd(){
        if(head == null) return

        val newTail = tail?.prev
        if(newTail == null) head = null
        else newTail.next = null

        tail = newTail
        size--
    }

    fun printList(){
        var tempHead = head
        print("HEAD -> ")
        while(tempHead != null){
            print("$tempHead")
            print(" <-> ")
            tempHead = tempHead.next
        }

        println("null")
    }

    fun addBefore(newEmployee: Car, existingEmployee: Car): Boolean {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if (head != null) {
            var currentEmployer: CarNode? = head
            val newNode: CarNode

            while (true) {
                if (currentEmployer != null) {
                    if (currentEmployer.car === existingEmployee) {
                        val newEmployerNode = CarNode(newEmployee)
                        if (currentEmployer.prev == null) {
                            newEmployerNode.next = currentEmployer
                            currentEmployer.prev = newEmployerNode
                            head = newEmployerNode
                        } else {
                            newEmployerNode.next = currentEmployer
                            newEmployerNode.prev = currentEmployer.prev
                            currentEmployer.prev?.next = newEmployerNode
                            currentEmployer.prev = newEmployerNode
                        }
                        return true
                    } else
                        currentEmployer = currentEmployer.next
                } else
                    return false
            }
        }
        return false
    }

    fun getSize(): Int = size

}
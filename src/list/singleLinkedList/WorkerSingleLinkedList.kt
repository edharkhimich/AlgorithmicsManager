package list.singleLinkedList

class WorkerSingleLinkedList {

    private var head: WorkerNode? = null
    private var size: Int = 0

    fun addWorker(worker: Worker){
        val current = WorkerNode(worker)
        current.next = head
        head = current
        size++
    }

    fun getSize(): Int = size

    fun printList(){
        var tempHead = head
        while (tempHead != null){
            print(" HEAD -> ${tempHead.worker} /")
            tempHead = tempHead.next
        }

        print("HEAD -> $tempHead")
    }

    fun removeWorker(){
        val removedNode = head
        head = removedNode?.next
        size--
    }
}
import list.doubleLinkedList.Car
import list.doubleLinkedList.CarDoubleLinkedList
import list.singleLinkedList.Worker
import list.singleLinkedList.WorkerSingleLinkedList

fun main() {
//	var array = Array<Int>(1_000_0) { (-1000..100000).random() }
////	mergeSort(array, 0, array.size)
////	bubbleSort(array)
////	selectionSort(array)
////	insertedSort(array)
////	shellSort(array)
////	countSort(tempArray)

//	runSingleWorkerLinkedList()
	runDoubleCarLinkedList()


}

fun runSingleWorkerLinkedList(){
	val cow = Worker("Alex")
	val goat = Worker("Max")
	val dog = Worker("Jade")
	val cat = Worker("Nikolas")

	val workerLinkedList = WorkerSingleLinkedList()

	workerLinkedList.run {
		addWorker(cow)
		addWorker(goat)
		addWorker(dog)
		addWorker(cat)
	}

	println("workerListSize ${workerLinkedList.getSize()}")

	workerLinkedList.printList()

	workerLinkedList.removeWorker()
	workerLinkedList.removeWorker()

	println()
	println("workerListSize After removing  ${workerLinkedList.getSize()}")

	println()
	println("worker removed")

	workerLinkedList.printList()
}

fun runDoubleCarLinkedList(){

	val carDoubleLinkedList = CarDoubleLinkedList()

	val ferrari = Car("Ferrari")
	val ford = Car("Ford")


	carDoubleLinkedList.run {
		addToFront(ford)
		addToFront(ferrari)
		addToFront(Car("Nissan"))
	}

	carDoubleLinkedList.printList()

	carDoubleLinkedList.addBefore(Car("Edgarrrr"), ferrari)

	carDoubleLinkedList.printList()


}







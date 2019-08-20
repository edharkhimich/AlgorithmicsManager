package list.doubleLinkedList

data class CarNode(val car: Car, var prev: CarNode? = null, var next: CarNode? = null) {

    override fun toString(): String = " Car $car"
}
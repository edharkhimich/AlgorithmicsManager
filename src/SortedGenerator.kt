import java.sql.Time
import kotlin.random.Random
import array.ArrayManager.insertedSort
import array.ArrayManager.bubbleSort
import array.ArrayManager.countSort
import array.ArrayManager.selectionSort
import array.ArrayManager.shellSort
import array.ArrayManager.mergeSort

fun main() {
	var array = Array<Int>(1_000_0) { (-1000..100000).random() }

	val tempArray = arrayOf(5, 3, 2, 3, 4, 6, 9, 3, 1)

//	mergeSort(array, 0, array.size)
//	bubbleSort(array)
//	selectionSort(array)
//	insertedSort(array)
//	shellSort(array)
//	countSort(tempArray)

	tempArray.forEach { print("$it / ") }


}







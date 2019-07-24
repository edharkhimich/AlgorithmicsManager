import java.sql.Time
import kotlin.random.Random
import array.ArrayManager.insertedSort
import array.ArrayManager.bubbleSort
import array.ArrayManager.selectionSort
import array.ArrayManager.shellSort
import array.ArrayManager.mergeSort

fun main() {
	var array = Array<Int>(1_000_0, { (-1000..100000).random() })

	val tempArray = arrayOf(20, 35, -15, 7, 55, 1, 22)

	mergeSort(array, 0, array.size)
//	array = Array<Int>(1_000_0, { (-1000..100000).random() })
	bubbleSort(array)
//	array = Array<Int>(1_000_0, { (-1000..100000).random() })
	selectionSort(array)
//	array = Array<Int>(1_000_0, { (-1000..100000).random() })
	insertedSort(array)
//	array = Array<Int>(1_000_0, { (-1000..100000).random() })
	shellSort(array)
//	array = Array<Int>(1_000_0, { (-1000..100000).random() })


}







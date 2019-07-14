import java.sql.Time
import kotlin.random.Random
import array.ArrayManager.insertedSort
import array.ArrayManager.bubbleSort
import array.ArrayManager.selectionSort
import array.ArrayManager.shellSort

fun main() {
	val array = Array<Int>(1_000_0, { (-1000..100000).random() })

	val tempArray = arrayOf(20, 35, -15, 7, 55, 1, 22)
	
	
	bubbleSort(array)
	selectionSort(array)
	insertedSort(array)
	shellSort(array)

}







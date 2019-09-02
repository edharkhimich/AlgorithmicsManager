package queue

class StringQueue(private val length: Int){

    private var front = 0;
    private var back = 0;
    private var queue = arrayOfNulls<String>(length)

    fun add(string: String){
        if(back == queue.size){
            val tempQueue = arrayOfNulls<String>(queue.size * 2)
            System.arraycopy(queue, 0, tempQueue, 0, queue.size)
            queue = tempQueue
        }

        queue[back++] = string
    }

    fun get(): String? {
        if(back == 0) {
            throw NoSuchElementException()
        }

        return queue[back]
    }

    fun remove(): String? {
        if(back == 0){
            throw NoSuchElementException()
        }

        val tempString = queue[back]
        queue[back--] = null
        return tempString
    }

    fun print(){
        var x = 0;
        while(x < back - front){
            println(queue[x++])
        }
    }

    fun size() = back - front
}
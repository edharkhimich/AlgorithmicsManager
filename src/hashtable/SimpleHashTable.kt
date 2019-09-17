package hashtable

class SimplePersonHashTable {

    private var hashtable = arrayOfNulls<Person>(10)

    private fun hashKey(key: String): Int = key.length % hashtable.size

    fun remove(key: String){
        hashtable[hashKey(key)] = null
    }

    fun put(key: String, person: Person){
        val index = hashKey(key)
        if(hashtable[index] == null) hashtable[index] = person
        else println("Sorry, the item with your hashcode is already exist")
    }

    fun size(): Int = hashtable.size

    fun get(key: String): Person? = hashtable[hashKey(key)]

    fun printHashtable(){
        hashtable.forEach {
            if(it != null) println("${it.name} & ${it.lastName}")
            else println(it)
        }
    }
}

class Person (val name: String, val lastName: String)
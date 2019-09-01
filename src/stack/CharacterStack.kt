package stack

import java.util.*

class CharacterStack(length: Int) {

    private var stack: Array<Char?> = arrayOfNulls(length)
    private var pointer = 0

    fun add(character: Char?) {
        if (pointer == stack.size) {
            val tempStack: Array<Char?> = arrayOfNulls(stack.size * 2)
            System.arraycopy(stack, 0, tempStack, 0, stack.size)
            stack = tempStack
        }

        stack[pointer] = character
        pointer++
    }

    fun pop(): Char? {
        if (isEmpty()) throw EmptyStackException()

        val c = stack[--pointer]
        stack[pointer] = null

        return c
    }

    fun get(): Char? {
        if (isEmpty()) throw EmptyStackException()

        return stack[pointer]
    }

    fun isEmpty(): Boolean = pointer == 0

    fun length(): Int = stack.size

    fun getPointer(): Int = pointer

    fun printStack() {
        for (i in pointer - 1 downTo 0) {
            print(stack[i])
        }
        println()
    }
}
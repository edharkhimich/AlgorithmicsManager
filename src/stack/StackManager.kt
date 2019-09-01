package stack

fun main() {
    // should return true
    println(checkForPalindrome("abccba"))
//         should return true
    println(checkForPalindrome("Was it a car or a cat I saw?"))
//        // should return true
    println(checkForPalindrome("I did, did I?"))
//        // should return false
    println(checkForPalindrome("hello"))
//        // should return true
    println(checkForPalindrome("Don't nod"))
}

private fun checkForPalindrome(string: String): Boolean {
    val newString = string.trim { it <= ' ' }.replace("[^a-zA-Z0-9]".toRegex(), "")
    val firstPartStack = CharacterStack(string.length)
    val secondPartStack = CharacterStack(string.length)
    var c: Char?

    var isPalindrome = false

    for (y in 0 until newString.length) {
        c = Character.toLowerCase(newString[y])
        firstPartStack.add(c)
    }

    for (i in 0 until newString.length / 2) {
        secondPartStack.add(firstPartStack.pop())
    }

    if (firstPartStack.getPointer() == secondPartStack.getPointer()) {
        for (i in 0 until firstPartStack.getPointer()) {
            if (firstPartStack.pop() === secondPartStack.pop()) {
                isPalindrome = true
            } else {
                isPalindrome = false
                break
            }
        }
    } else {
        if (firstPartStack.getPointer() - 1 == secondPartStack.getPointer()) {
            firstPartStack.pop()
            for (i in 0 until firstPartStack.getPointer()) {
                if (firstPartStack.pop() === secondPartStack.pop()) {
                    isPalindrome = true
                } else {
                    isPalindrome = false
                    break
                }
            }
        }
    }

    return isPalindrome
}
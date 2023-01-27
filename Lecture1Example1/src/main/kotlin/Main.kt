fun main(args: Array<String>) {

    // First test case
    // Fault does not result with failure
    val myArray1: IntArray = intArrayOf(5, 2, 3)

    print("Values of the array:")
    for (i in myArray1.indices) {
        print(" " + myArray1[i] + " ")
    }
    println()

    val evenNumbersCount1: Int = countEvenNumbers(myArray1)
    println("There are $evenNumbersCount1 even numbers in the array.")


    // Second test case
    // Fault results with failure
    val myArray2: IntArray = intArrayOf(5, 2, 4)

    print("Values of the array:")
    for (i in myArray1.indices) {
        print(" " + myArray2[i] + " ")
    }
    println()

    val evenNumbersCount: Int = countEvenNumbers(myArray2)
    println("There are $evenNumbersCount even numbers in the array.")
}


/**
 * Count even numbers in an array
 *
 * @param myArray array to count even numbers in
 * @return the count of even numbers in myArray
 */
fun countEvenNumbers(myArray: IntArray): Int {
    var count: Int = 0

    // Error: myArrayLength must be myArrraySize - 1
    val myArrayLength: Int = myArray.size - 2

    for (i in 0..myArrayLength) {
        if (myArray[i] % 2 == 0) {
            // The value is even
            count++
        }
    }

    return count
}
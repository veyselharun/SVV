/*
 * Fault, Error, Failure Example
 * Kotlin example of software fault, error, and failure concepts.
 */

fun main(args: Array<String>) {

    // First test case
    // Fault does not result with failure
    val myArray1: IntArray = intArrayOf(5, 2, 3)

    print("Values of the first array:")
    for (i in myArray1.indices) {
        print(" " + myArray1[i] + " ")
    }
    println()

    val evenNumbersCount1: Int = countEvenNumbers(myArray1)
    println("There are $evenNumbersCount1 even numbers in the array.")


    // Second test case
    // Fault results with failure
    val myArray2: IntArray = intArrayOf(5, 2, 4)

    print("Values of the second array:")
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

    // Fault: myArrayLength must be myArrraySize - 1
    val myArrayLength: Int = myArray.size - 2

    // For both of the test cases the fault results with an
    // error, incorrect program state at this point.
    // Error: myArrayLength must be 2 not 1.
    // Program State of this error:
    // Program counter (PC) = i = 0
    // count = 0
    // myArrayLength = 1 (Must be 2)

    // For the first test case the program produces the expected output.
    // There is no failure.
    // Error did not result with failure. It did not propagate to the
    // value of even number count.
    // count = 1 -> Expected value 1, actual value 1

    // For the second test case the program does produce the expected output.
    // There is failure.
    // Error resulted with failure. It propagated to the
    // value of even number count.
    // count = 1 -> Expected value 2, actual value 1
    for (i in 0..myArrayLength) {
        if (myArray[i] % 2 == 0) {
            // The value is even
            count++
        }
    }

    return count
}
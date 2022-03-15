

fun main() {
    val name = "Bill Clinton"
    var country = "Romania"

    //  Difference between val and var is that variables declared with val cannot be reassigned

    var score: Int //can initialize later


    // Null safety
    //  You can assign null to a variable whenever you want to signal that it doesn't have a value
//    var car: Car? = null
//
//    car = Car("Mercedes Benz")
//}
//
//class Car {
//
//}



    //  Conditional Statements
    val a = 5
    val b = 12
    var max = -1

    if (a > b) {
    max = a
    } else {
        max = b
    }

    println(max) //prints 12
}
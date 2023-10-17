import java.util.LinkedList

fun main4() {
    var arrayList: ArrayList<Int> = ArrayList()
    var linkedList: LinkedList<Int> = LinkedList()

    var startTime = System.nanoTime() //
    for(i in 0..100000) {
        arrayList.add(0,i)
    }
    var stopTime = System.nanoTime()
    println("ArrayList add to the begin:  ${stopTime-startTime}")

    startTime = System.nanoTime() //
    for(i in 0..100000) {
        linkedList.add(0,i)
    }
    stopTime = System.nanoTime()
    println("LinkedList add to the begin: ${stopTime-startTime}")


    startTime = System.nanoTime() //
    for(i in 30000..60000) {
        arrayList.get(i)
    }
    stopTime = System.nanoTime()
    println("ArrayList get from the middle:  ${stopTime-startTime}")

    startTime = System.nanoTime() //
    for(i in 30000..60000) {
        linkedList.get(i)
    }
    stopTime = System.nanoTime()
    println("LinkedList get from the middle: ${stopTime-startTime}")



    startTime = System.nanoTime() //
    for(i in 0..100000) {
        arrayList.add(i)
    }
    stopTime = System.nanoTime()
    println("ArrayList add to the end:  ${stopTime-startTime}")

    startTime = System.nanoTime() //
    for(i in 0..100000) {
        linkedList.add(i)
    }
    stopTime = System.nanoTime()
    println("LinkedList add to the end: ${stopTime-startTime}")
}







fun String.isValidCCNumber() : Boolean {
    val digits = this.filter { it.isDigit() }
    var sum = 0
    // справа налево
    for (i in digits.indices.reversed()) {
        var digit = digits[i].toString().toInt()
        if((digits.length-i)%2 == 0) {
            digit *= 2
            if(digit > 9)  {
                digit -= 9
            }
        }
        sum += digit
    }

    return sum%10==0
}
class Student(val age: Int, val name: String)
fun main3() {
    val s1 = Student(12, "Ivan")
    val s2 = Student(21, "Petr")
    val s3 = Student(23, "Olga")

    val students = mutableListOf(s1,s2,s3)
    val comparator = compareBy<Student> {  it.name }
    students.sortWith(comparator)


    val age: Int? = 4
    age?.let {
        println("Your age is $it")
    }



}
fun main() {


    val y : Int = 123123
    val y1: Int? = null



    val b : String? = readln()

    println(b?.length)

    val l1 = if (b != null) b.length else -1

    val l2 = b?.length ?: -1

    val str2 = "dgad234234 23422dfsdg"
    var sum = 0
    val digits = str2.filter { it.isDigit() }
    // справа налево
    for(i in digits.indices.reversed()) {
        var digit = digits[i].toString().toInt()
        if((digits.length-i)%2 == 0) {
            digit *=2
            if(digit > 9)
                digit -= 9
        }
        sum += digit
    }
    return sum%10==0




    var names: List<String> = listOf("Ivan","Petr")
    val names2: List<String> = listOf("Maria","Olga")

    names = names2
    println(names2)
    names[0] = "Maria"

    var cities= mutableListOf("Msk","Kzn","Spb")
    cities[0] = "EKT"
    cities.add("TTT")
    var countries = arrayListOf("RU","CN")
    cities = countries
    println(cities)








   // println(solution(arrayListOf("Apple","Apple","Apple","Orange"), "Apple"))

  //  val stringList = mutableListOf();

    val test = Test()
    test.toDo()
    test.doSmth()
    val str = "234234234"
    str.countOfLetters()
}
class Test {
    fun toDo() {

    }
}
// функция расширения
fun String.countOfLetters() {

}
fun Test.doSmth() {

}



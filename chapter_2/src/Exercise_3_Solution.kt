
fun main(){
    //calculate and print how many books you can read in 30 minutes
    println(
        //here your code
        50/(60/30)

    )
    //divide the number of pages in a book (1000) by the number of pages you can read
    // in 30 minutes to get the number of days you need to read a single book.
    println(
        //here your code
        1000/(50/(60/30))

    )
    //you have 13 books, so multiply 13 by the number of days you need for a single book
    // to get the total number of days you need to read them all.
    println(
        //here your code
        13 * 1000/(50/(60/30))

    )
    // use integer division to calculate how many full months you need to read all the books
    println(
        //here your code
        (13 * 1000/(50/(60/30)))/30

    )
    //use the modulo operation to know how many remaining  days you need to read the books.
    println(
        //here your code
        (13 * 1000/(50/(60/30))) % 30

    )
}
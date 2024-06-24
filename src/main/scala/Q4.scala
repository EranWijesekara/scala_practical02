object ticket{




def attendees(price : Int): Int = {
    return 120 + (15 - price) / 5 * 20
}

def revenue(price : Int): Int = {
    return price * attendees(price)
}

def cost(price : Int): Int = {
    return 500 + 3 * attendees(price)
}

def profit(price : Int): Int = {
    return revenue(price) - cost(price)
}

def main(args: Array[String]): Unit = {
    println("Price: 10, Profit: " + profit(10))
    println("Price: 15, Profit: " + profit(15))
    println("Price: 20, Profit: " + profit(20))
    println("Price: 25, Profit: " + profit(25))
    println("Price: 30, Profit: " + profit(30))
}
}
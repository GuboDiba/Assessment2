fun main() {
    var place=places("Nairobi")
    println(place)

    val pass=passwords("345gufsfar")
    println(pass)

    multiples()
    deposit(200.50)
    withdraw(20.50)
    details(1274563,1290.75,"Gubo Diba")
    withdraw(300)
}

//No 1
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun places(place:String){
    var firstChar=place[0]
    println(firstChar)
    var length=place.count()
    println(length)
    var last=place[place.length-1]
    println(last)




}

//No 2
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun passwords(password:String):Boolean{
    if (password.length>=8 && password.length<=16 && password==password){
        return true
    }
    else {
        return false
    }
}






//No 3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples(){
    for(m in 1..1000){
        if (m%6==0 && m%8==0){
            println("Bingo!")
        }else{
            println(m)
        }
    }
}
//No 4
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
data class CurrentAccount(var accnumber:Int,var accname:String,var balance:Double)
fun deposit(amount:Double){
    var balance=0.0
    balance+=amount
    println(balance)
}
fun withdraw(amount:Double){
    var balance=200.50
    balance-=amount
    println(balance)
}
fun details(accnumber: Int,balance: Double,accname:String){
    println("account number $accnumber with balance $balance is operated by $accname")
}
//No 5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
data class SavingAccount(var accnumber:Int,var accname:String,var balance:Int,var withdrawals:Int)
fun withdraw(withdrawals:Int){
//    var read= readLine()
//    val w=0

        if (withdrawals<4){
            println("you can not withdraw")

    }
       else{
        println("you can withdraw")
    }
}

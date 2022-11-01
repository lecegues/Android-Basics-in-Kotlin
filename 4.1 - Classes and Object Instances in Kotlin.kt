// Create a class with a passed parameter
class Dice(var numSides: Int) {
    
 
    // function to roll the dice depending on how much sides there are
    fun roll(): Int{
        
        // Better coding practice to remove extra line and return the value itself
        /*
        val randomNumber = (1..numSides).random();
        return randomNumber;
        */
        return (1..numSides).random();
        
    }
    
}

fun main(){
  
    // argument must be passed when creating object instance
    val myFirstDice = Dice(5);
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}");
    
    myFirstDice.numSides = 20;
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}");
  
}

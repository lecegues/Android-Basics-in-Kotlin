// Create a Dice class with a passed parameter
class Dice(var numSides: Int, var color: String) {
    
 
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

// create a Coin class with the ability to flip
class Coin(){
    
    fun flip(): String{
        
        val numFlipped = (0..1).random();
        
        // if 0, then heads. If 1, then tails. Anything else and we know an error occurred.
        if (numFlipped == 0){
            return "Heads";
        }
        else if (numFlipped == 1){
            return "Tails";
        }
        else{
            return "An error has occurred in Coin.flip() function";
        }
        
    }
        	
        
    
}

fun main(){
  
    // argument must be passed when creating object instance
  
    val originalDice = Dice(5, "red");
    println("Your ${originalDice.color} ${originalDice.numSides} sided dice rolled ${originalDice.roll()}");
    
    // change value and reprint
    originalDice.numSides = 10;
    originalDice.color = "green";
    println("Your ${originalDice.color} ${originalDice.numSides} sided dice rolled ${originalDice.roll()}");
  	
    println("-----------------------");
    
    val myCoin = Coin();
  
    println("You flipped a coin. It was ${myCoin.flip()}");
    println("You flipped a coin. It was ${myCoin.flip()}");

    
}

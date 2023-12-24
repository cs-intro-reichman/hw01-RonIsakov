class Coins {
    public static void main(String[] args) {
	// user inserting amount of conis
	// int coins = Integer.parseInt(args[0]);
	
	// defining tow ints quarters and cents and seting them to 0
	int coins = 132;
	int quarters = 0;
	int cents = 0;
	
	//defining quarters as coins/25
	//defining cents as coins%25
	quarters = coins/25;
	cents = coins%25;
	
	// printing Use  + quarters and + cents
   System.out.println(	"Use " + quarters + " quarters and " + cents + " cents"); 
	
	
	
	
	
	}
	}
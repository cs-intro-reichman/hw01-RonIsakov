public class Gen3 {
    public static void main(String[] args) {
        // defining range limA as the smallest limB as the greatest
        int limA = 10;
        int limB = 30;
        // setting three ints as random in the range defined
        int num1 = (int) (Math.random() * (limB - limA ) + limA);
        int num2 = (int) (Math.random() * (limB - limA ) + limA);
        int num3 = (int) (Math.random() * (limB - limA ) + limA);
        // setting numMin as the smallest number
        int numMin = Math.min(Math.min(num1, num2), num3);
        // printing the three numbers one line under the next and 
		//"The minimal generated number was " + numMin
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("The minimal generated number was " + numMin);
    }
}

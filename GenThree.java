public class GenThree {
 public static void main(String[] args) {
 // inserting range limA as the smallest limB as the greatest
 int limA = Integer.parseInt(args[0]);
 int limB = Integer.parseInt(args[1]);
 
 // setting three ints as random in the range defined
 int num1 = (int) (Math.random() * (limB - limA ) + limA);
 int num2 = (int) (Math.random() * (limB - limA ) + limA);
 int num3 = (int) (Math.random() * (limB - limA ) + limA);
 
 // setting numMin as the smallest number
 int numMin = Math.min(Math.min(num1, num2), num3);
 
 // printing numMin an the three numbers
  System.out.println(num1);
  System.out.println(num2);
  System.out.println(num3);
 System.out.println("The minimal generated number was " + numMin);
 }
}

public class Triangle {
 public static void main(String[] args) {
	 
 // Defining three sides as ints to the triangle
 int side1 = Integer.parseInt(args[0]);
 int side2 = Integer.parseInt(args[1]);
 int side3 = Integer.parseInt(args[2]);
 
 // Checking which side is the longest and defining it as an int
 // Defining the rest as the sum of the two smallest sides
 int longest = Math.max(Math.max(side1, side2), side3);
 int theRest = (side1 + side2 + side3 - longest ) ;
 
 // defining chek as true if the sum of the lengths of any two sides
//is greater than the length of the remaining side
 boolean check = (longest - theRest) < 0;
 
// printing side1,side2,side3: boolean check 
System.out.println( side1 + ", " + side2 + ", " + side3 + ": " + check);
 
 }
}
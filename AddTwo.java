class AddTwo {
 public static void main(String[] args) {
 //user iserting two ints num1,num2
 int num1 = Integer.parseInt(args[0]);
 int num2 = Integer.parseInt(args[1]);
 
//defining sum as num1 + num 2
int sum = num1 + num2;

//printing num1 + num2 = the sum of num1 and num 2
 System.out.println(num1 + " + " + num2 + " = " + sum);
 }
}
class LinearEq {
    public static void main(String[] args) {
		// inserting three doubles a,b,c 
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		// definig double x as the solution to the equation
		double x = (c-b)/a;
		
		// printing the equation
		// printing the soulotion (x)
        System.out.println( a + " * x + " + b + " = " + c );
		System.out.println( "x = " + x );
	}
	}
	
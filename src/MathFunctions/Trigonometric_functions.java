package MathFunctions;

public class Trigonometric_functions {

	static class MathFunc {
		double PI = 3.141592653589793;
		
		public double toRadians(double d) {
			return d * PI/180;
		}
		
		public double Sin(double d) { 

			double index = 1.0;      // ith term = x^i / i!
			double value  = 0;      // sum of first i terms in taylor series

	        // looping until index isn't zero	        
	        for (int i = 1; index != 0.0; i++) {
	            
	        	// multiplicating index
	        	index *= (d / i);
	         
	        	// if the value of i is in form of 5, 9, 13	        	
	        	if (i % 4 == 1) {
	            	value += index;
	            }
	        	
	        	// if the value of i is in form of 3, 7, 11
	            if (i % 4 == 3) {
	            	value -= index;
	            }
	        }
	        return value;
		}
		
		public static long factorial(long f) {
		    if (f == 0) {
		        return 1;
		    } else {
		        return f * factorial(f - 1);
		    }
		}
		
		
		public int factorial(double d) {
			 int fact=1;      
			  for(int i=1;i<=d;i++){    
			      fact=fact*i;    
			  }  
			  return fact;
		}
		
		public float power(double base, double exponent) {
			float result = 1;

	        for (;exponent != 0; --exponent)
	        {
	            result *= base;
	        }
	        return result;
		}
		
		public double Cos(double x)
		{
			double sum=0;
			int i;
			for (i=0;i<=10;i++) {
				sum = sum + (power(-1,i)*power(x,2*i))/factorial(2*i);
			}
			return sum;
		}
		
	   public double Tan(double x) 
	   { 
		   
		   double sine = Sin(toRadians(x));
		   double cos = Cos(toRadians(x));
		   
		   return sine/cos;
		   
	   } 
	

	   public MathFunc() {
		   System.out.println("object created");
	   }
	    public static void main(String args[]) {
	    	MathFunc mf = new MathFunc();
	    	System.out.println(mf.toRadians(30.0));
	    }
	}
}

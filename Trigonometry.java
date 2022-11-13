


public class Trigonometry {
	private static final double PI = 3.14159265;
	
	
	public static double degreeToRadian(double degree) {
		return (PI/180)*degree;
	}
	
	public static double sin(double x) {
		double result = x;
		double power = x, fact = 1;
		
		for(int i=3,j=1;i<30;i+=2,j++) {
			fact = fact * i * (i-1);
			power = (power*x*x);
			if(j%2==0) {
				result += (power/fact);
			} else {
				result -= (power/fact);
			}
		}
		
		return result;
	}
	
	public static double cos(double x) {
		double result = 1;
		double power = 1, fact = 1;
		
		for(int i=2,j=1;i<31;i+=2,j++) {
			fact = fact * i * (i-1);
			power = (power*x*x);
			if(j%2==0) {
				result += (power/fact);
			} else {
				result -= (power/fact);
			}
		}
		
		return result;
	}
	
	public static double tan(double x) {
		return (sin(x)/cos(x));
	}
	
}

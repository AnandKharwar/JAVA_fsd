package typecasting;

public class casting {
public static void main(String[] args) {
		
		//ImplicitTypecasting
		byte a=10;
		System.out.println("Byte: "+a);
		
		short b=a;
		System.out.println("Byte to Short Conversion: "+b);
		
		int c =b;
		System.out.println("Short to Int Conversion: "+c);
		
		int d=a;
		System.out.println("Byte to Int Conversion: "+d);
		
		float e=d;
		System.out.println("Int to Float Conversion: "+e);
		
		double f=e;
		System.out.println("Float to double Conversion: "+f);
		
		double g=d;
		System.out.println("Int to double Conversion: "+g);
		//ExplicitTypeCasting
       double x= 23.67;
		
		int y=(int) x;  ///convert forcefully to int
		
		System.out.println("Converted Double "+x+" to int "+y);
		
		
	}

}

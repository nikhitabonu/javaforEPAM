import java.util.*;
import java.lang.Math;
public class Main1
{
	public static void main(String[] args) {
		int m,m;
		double d1,d2;
		Scanner sc= new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
	    d1=sc.nextDouble();
	    d2=sc.nextDouble();
	    int cal1=cal(m,n);
	    double cal2=calc(d1,d2);
	    System.out.println("Int c1: "+cal1);
	    System.out.println("Double c2: "+cal2);
		
	}
		public static int cal(int m,int n)
		{
		    int c1=(int)Math.pow(m,n);
		    return c1;
		
 	}
 	public static double calci(double d1,double d2)
 	{
 	    double c2=Math.pow(d1,d2);
 	    return c2;
 	}
}

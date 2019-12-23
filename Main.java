import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int height,length,breadth;
		Scanner sc= new Scanner(System.in);
		height=sc.nextInt();
		length=sc.nextInt();
		breadth=sc.nextInt();
		int v=volume(lenghth,breadth,height);
		System.out.println("Volume is: "+v);
	}
		public static int volume(int length,int breadth,int height)
		{
		    int v=length*breadth*height;
		    return v;
		
 	}
}

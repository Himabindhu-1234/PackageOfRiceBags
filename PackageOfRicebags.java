package JavaPrograms;
import java.util.Scanner;
public class PackageOfRicebags {

	public static int packageRiceBag(int big, int small, int goal) { 
      int result=-1;
		if (big * 5 >= goal) {
		    if (small >= goal % 5)
		        result = -1;
		} else {
		    if (small >= goal - big * 5) {
		        result= goal-big*5;
		    }
		}
		return result;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of big bags available: ");
		int big = s.nextInt();
		System.out.print("Enter no of small bags available: ");
		int small = s.nextInt();
		System.out.print("Enter no bags required: ");
		int goal = s.nextInt();
		if(PackageOfRicebags.packageRiceBag(big,small,goal)==-1)
		{
			System.out.println("-1 \n sorry we are out of stock");
		}
		
		else
		{
			System.out.println("the no of small rice bags required:" + (goal-big*5));
		}
	}

}
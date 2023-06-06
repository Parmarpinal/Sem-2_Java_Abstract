import java.util.Scanner;
public class odd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,co=0,ce=0;
		int[] a;
		System.out.println("Enter no of array elements:");
		n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++){
        	System.out.println("Enter element:");
        	a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
        	if(a[i]%2==0){
        		ce++;         
        	}
        	else{
                co++;
        	}
        }

        System.out.println("Number of even no="+ce);
        System.out.println("Number of odd no="+co);
	}
}
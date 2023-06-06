import java.util.Scanner;
public class divisible{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		int[] a;
		System.out.println("Enter no of array elements:");
		n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++){
        	System.out.println("Enter element:");
        	a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
        	if(a[i]%3==0 || a[i]%5==0){
        		sum=sum+a[i];
        	}
        }
        System.out.println("Sum="+sum);
    }
}
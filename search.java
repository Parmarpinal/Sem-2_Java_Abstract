import java.util.Scanner;
public class search{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,b,count=0;
		int[] a;
		System.out.println("Enter no of array elements:");
		n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++){
        	System.out.println("Enter element:");
        	a[i]=sc.nextInt();
        }
        System.out.println("Enter no. for search:");
        b=sc.nextInt();
        for(i=0;i<n;i++){
        	if(a[i]==b){
        		System.out.println("number found at"+i);
        		count++;
        	}
        }
        System.out.println("Number repeat "+count+" times");
        if(count==0){
        	System.out.println("Not found");
        }
    }
}
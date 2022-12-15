import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int c=0,f=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=0;
        for(int i=1;i<=Integer.MAX_VALUE;i++)  
        {
             c=0;
            for(int j=1;j<=i;j++) 
            {
                if(i%j==0)
                {
                    c++; 
                }
            }
            if(c==2)
            {
                f++;
                if(f==n+1)
                {
                    break;
                }
                    arr[k]=i;
                    k++;
            }
        }
        for(int y=0;y<n;y++)
        {
            System.out.println(arr[y]);  
        }
    }
}

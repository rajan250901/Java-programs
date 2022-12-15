import java.util.*;
public class Rotate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //5
        int val=sc.nextInt(); //4
        int f=0;
        int t;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();  //4 5 6 7 8 
        }
        if(val<n)
        {
            int j;
            for(int i=0;i<val;i++)
        {
            for(j=0;j<n-1;j++)
            {  
             t=arr[j];
            arr[j]=arr[j+1];
            }
            arr[j]=t;
        }
        }
        /*for(int i=0;i<val;i++)
        {
            for(int j=0;j<n-1;j++)
            {  
            int t=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=t;
            }
        }*/
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
       /* System.out.println();
        int key=sc.nextInt();
        
        int l=0, h=n-1;
        while(l<h)
        {
            int m=(l+h)/2;
            if(arr[m]==key)
            {
                f=1;
                System.out.print("index of the "+ key +"is "+ m);
                return ;
            }
            else if(arr[m]>key)
            {
                h=m-1;
            }
            else if(key>arr[m])
            {
                l=m+1;
            }
        }
        if(f==0)
        {
            System.out.print("element not found");
        }*/ 
    }
}

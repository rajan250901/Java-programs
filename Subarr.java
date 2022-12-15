import java.util.*;
class Subarr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                { 
                System.out.print(arr[k]);
                }
                System.out.println();
            }
            
        }
    }
}


/* 
import java.util.*;
public class Subarr
{
     void subArra(int arr[], int n) 

    { 

        for (int i=0; i <n; i++) 

        { 

    

            for (int j=i; j<n; j++) 

            { 

                
                for (int k=i; k<=j; k++) 

                    System.out.print(arr[k]); 
                    System.out.println();

            } 
        }
    }
 
    public static void main(String[] args){
        int arr[] = new int[]{1, 2, 3, 4, 5}; 
     Subarr sub=new Subarr();
     sub.subArra(arr,5);
    }

        
}
*/



import java.util.*;
public class Containwatermost {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res=containsmax(arr,n);

    }
    public static int containsmax(int[] arr,int n)

    {
        int i=0,j=n-1;
        int max2=0;
        while(i<j)
        {
            int area=(j-i)*Math.min(arr[i],arr[j]);
            max2=Math.max(area,max2);
            if(arr[i]>=arr[j])
                j--;
            else
                i++;
        }
        return max2;

    }
}

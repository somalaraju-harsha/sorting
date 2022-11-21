//import java.util.Scanner;
//
//public class array {
//    public static void main(String[] args){
//
//        int size=0;
//        //int[] ar = new int[size];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of array");
//        size=sc.nextInt();
//
//        int[] ar = new int[size];
//
//        System.out.println("enter values of an array");
//        for(int i=0;i<ar.length;i++){
//            ar[i]=sc.nextInt();
//
//        }
//
//
////        System.out.println("entered array is");
//        for (int i=0;i<ar.length;i++)
//        {
//            for (int j=1;j<ar.length;j++)
//            {
//                if (ar[i]==ar[j])
//                {
//                    System.out.println(ar[j]);
//                }
//            }
//        }
//
//
//    }
//}








import java.util.Arrays;
import java.util.Scanner;
//finding duplicate in array
public class array {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        int size=sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }
}